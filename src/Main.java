public class Main {

    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        long longVal = 7;
        short shortVal = 5;

        short result1 = (short)longVal;
        long result2 = (byte)longVal - byteVal;

        int v1 = 45;
        int v2 = 34;
        int vMax = v1 > v2 ? v1 : v2;

        float students = 30;
        float rooms = 4;

        float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;
	System.out.println(studentsPerRoom);

	int u1 = 10, u2 = 4, diff;

	if (u1 > u2) {
        diff = u1 - u2;
        System.out.println("u1 is bigger");
        System.out.println(diff);
        }
    else if (u2 > u1) {
        diff = u2 -u1;
            System.out.println("u2 is bigger");
            System.out.println(u2);
        }
    else
        System.out.println("u1 and u2 are equal");

        double students1 = 30.0;
        double rooms1 = 4.0;

        if(rooms1 > 0.0) {
            System.out.println(students1);
            System.out.println(rooms1);
            double avg = students1/rooms;
            System.out.println(avg);
        }

    }



    }
