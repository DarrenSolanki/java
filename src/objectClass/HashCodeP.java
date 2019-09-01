package objectClass;

public class HashCodeP {

		public int hashCode() {
//			return super.toString();
			return 10+10;
		}
		
		
		
		
		public static void main(String[] args) {

//			HashCodeP b = new HashCodeP();
//			System.out.println(b.hashCode());
//			HashCodeP b1 = new HashCodeP();
//			System.out.println(b1.hashCode());
//			HashCodeP b2 = b1;
//			System.out.println(b2.hashCode());
			
			System.out.println("Equals ()");
			HashCodeP b1 = new HashCodeP();
			HashCodeP b2 = new HashCodeP();
			System.out.println(b1.equals(b2));
			HashCodeP b3 = b2;
			System.out.println(b3.equals(b2));

		}

	}

