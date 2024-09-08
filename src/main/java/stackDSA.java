import java.util.Iterator;
import java.util.Stack;

public class stackDSA {

    // *******************************************************

    // stack = LIFO data structure. Last-In First-Out
    //               stores objects into a sort of "vertical tower"
    //               push() to add objects to the top
    //               pop() to remove objects from the top

    // uses of stacks?
    // 1. undo/redo features in text editors
    // 2. moving back/forward through browser history
    // 3. backtracking algorithms (maze, file directories)
    // 4. calling functions (call stack)

    // *******************************************************

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        // How to iterate through a stack
        Iterator values = stack.iterator(); // The method iterates over the elements of the stack and returns the values(iterators)

        while(values.hasNext()){ // hasNext() checks if the iteration has more values
            System.out.println(values.next()); // next() returns next value in iteration
        }

        // String myFavGame = stack.pop();
        //System.out.println(stack.peek());
        System.out.println(stack.search("FFVII"));
        System.out.println(stack);


        stack.clear(); // removes everything from the stack
        System.out.println(stack);

    }


}

