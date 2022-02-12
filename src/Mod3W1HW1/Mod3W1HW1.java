package Mod3W1HW1;

public class Polly {
	
		public static boolean getUp(boolean squawking, int currentHour) {
			
				if(squawking == true && (currentHour < 0 || currentHour >= 23)) {
					return false;
				} else if (squawking == true && (currentHour < 6 || currentHour >= 22)) {
					return true;
			} else {
				return false;
			}
		}
		
		public static void main(String[] args) {
			
			System.out.println(getUp(true, 4));
			
		}
}


