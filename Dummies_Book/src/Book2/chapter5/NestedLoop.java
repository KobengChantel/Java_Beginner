package Book2.chapter5;
// nested loop
//which is simply a loop that is completely
//contained inside another loop. The loop that’s inside is called the inner loop, and
//the loop that’s outside is called the outer loop

// pair of loops
public class NestedLoop {
public static void main(String[] args) {
    for(int x = 1; x < 10; x++) //outer loop
    {
        for (int y = 1; y < 10; y++)//inner loop
            System.out.print(x + "-" + y + " ");
        System.out.println();
    }
}
}
