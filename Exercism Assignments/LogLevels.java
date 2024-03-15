package exercism;

public class LogLevels {

	public static String message(String logLine) {
		logLine = logLine.substring(logLine.indexOf(":") + 1);
		return logLine.trim();
	}

	public static String logLevel(String logLine) {
		if (logLine.toLowerCase().contains("info"))
			return "info";
		if (logLine.toLowerCase().contains("warning"))
			return "warning";

		return "error";
	}

	public static String reformat(String logLine) {
		return message(logLine) + " (" + logLevel(logLine) + ")";
	}
}