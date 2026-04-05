class recursion {
    // Recursive function to print name count times
    public void printName(String name, int count, int N) {
        // Base case: if count equals N, stop recursion
        if (count == N)
            return;

        // Print the name
        System.out.println(name);

        // Recursive call with incremented count
        printName(name, count + 1, N);
    }
    public static void main(String[] args) {
        recursion sol = new recursion();
        int N = 5;
        String name = "Ashish";

        sol.printName(name, 0, N);
    }
}




