/*
 * We use the switch-case statement to avoid performance issues that can arise with multiple if-else-if conditions.
 * In a switch statement, execution directly jumps to the matching case instead of checking each condition sequentially.
 * For example, it directly goes to the "edge" case without evaluating from "chrome" onward, improving performance.
 *
 * If break is not provided, execution will continue through all subsequent cases (fall-through behavior).
 *
 * Duplicate case values are not allowed in a switch statement.
 *
 * The default block can be placed anywhere (not necessarily at the end).
 *
 * The break statement is used only in loops and switch cases, not in if-else conditions.
 *
 * If there is a requirement to evaluate a range of values (e.g., numbers from 1 to 100),
 * it is better to use if-else-if instead of switch. This is a limitation of switch-case.
 *
 * Supported data types for switch: byte, short, int, char (and String in newer Java versions).
 * Not supported: long, float, double.
 *
 * Common use cases of switch-case:
 *   - Cross-browser logic
 *   - Cross-OS logic
 *   - Time zone handling
 *   - Role-based access control (RBAC) / user permissions
 *   - Running test cases across different environments (dev, QA, prod)
 */
public class SwitchCaseConcept {
	public static void main(String args[]) {
		String browser = " Edge ";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
			
		case "firefox":
			System.out.println("Launch FF");
			break;
			
		case "ie":
			System.out.println("Launch FF");
			break;
			
		case "edge":
			System.out.println("Launch Edge");
			break;
			
		default:
			System.out.println("Please pass right browwser");
			break;

		}
	}

}
