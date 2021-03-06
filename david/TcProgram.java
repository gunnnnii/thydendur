
import java.util.Arrays;
import java.util.ArrayList;

// TcProgram class ..................
public class TcProgram extends TreeCode {

	public TcProgram(String name, String entryPoint, TcFunction[] funcList) {
		super(null);

		outName = name;
		entry = entryPoint;
		defs = funcList;
	}

	@Override
	public String[] MasmCode(boolean tail)
			throws CompilerError
	{
		ArrayList<String> output = new ArrayList<>();
		output.add("\"" + outName + ".mexe\" = " + entry + " in");
		output.add("!");
		output.add("{{");

		for (TcFunction f : defs) {
			output.addAll(Arrays.asList(f.MasmCode(false)));
		}

		output.add("}}");
		output.add("*");
		output.add("BASIS");
		output.add(";");

		return output.toArray(new String[0]);
	}

	private String 			outName;
	private String 			entry;
	private TcFunction[]	defs;
}