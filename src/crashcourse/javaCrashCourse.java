package crashcourse;


import java.util.*;

public class javaCrashCourse {
    public static void main(String[] args) {

        // -- 1. TIPOS Y CASTING --------------------

        int X = Integer.MAX_VALUE;
        Integer x = Integer.MAX_VALUE;
        long grande = (long) x * 2; // Without long overflows, cast with (long)
        char c = 'a';
        System.out.println(c - 'a'); // 0
        System.out.println('z' - 'a'); // 25

        // -- 2. ARRAYS ------------------------------

        int[] arr = {5, 3, 1, 4, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[][] matrix = new int[3][4];
        System.out.println(matrix[0].length);
        matrix[0][0] = 5;
        arr[2] = 4;
        System.out.println("Arr has a length of " + arr.length);
        String[] arr2 = new String[5]; // Another way of declaring an array
        String[] arr3 = new String[]{"initialized", "values"};
        System.out.println("Here is a way to initialize an array with " + arr3[0] + " " + arr3[1]);

        // -- 3. STRING Y STRINGBUILDER -----------------------
        String s = "Hello, world";
        System.out.println(s.charAt(0)); //charAt returns a char
        System.out.println(s.substring(0, 5)); //Substring with start-index and end-index
        System.out.println("¿Contiene s a su substring? : " + s.contains(s.substring(0, 5)));
        char[] characters = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char ch : characters) sb.append(ch);
        System.out.println("Al usar StringBuilder con append en la variable del tipo StringBuilder se almacena " + sb);
        System.out.println(sb.reverse());

        // -- 4. ARRAYLIST ----------------------------------
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(1);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println("El array está vacío? : " + list.isEmpty());
        String response = list.isEmpty() ? "List is empty" : "" + list.size();
        System.out.println("El tamaño del array es : " + response);

        // -- 5. HASHMAP -------------------------------------
        int[] nums = new int[]{1, 2, 2, 2, 2, 3, 3, 3};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(0, n) + 1);
        }
        System.out.println(freq);
        System.out.println("Contiene la llave 1 ? : " + freq.containsKey(1));
        System.out.println("Valor de llave 1 ? : " + freq.get(1));
        System.out.println("Y si la llave no existe p. ej 25? : " + freq.get(25));
        freq.forEach((k, v) -> {
            System.out.println("Key :" + k + " -> " + v);
        });
        freq.forEach((k, v) ->
        {
            freq.replace(k, 25);
        });
        System.out.println(freq);

        // 7. PRIORITYQUEUE -----------------------------
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(5); minHeap.offer(2); minHeap.offer(3);
        System.out.println("La priority queue min es :"+minHeap);
        System.out.println("Sacamos el menor : "+minHeap.poll());
        System.out.println("La priority queue min es :"+minHeap);
        System.out.println("Otro mas : "+minHeap.poll());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // Orders bigger at the start
        maxHeap.offer(9); maxHeap.offer(1); maxHeap.offer(14);
        System.out.println("La priority queue max es :"+maxHeap);
        System.out.println("Sacamos el mayor : "+maxHeap.poll());
        System.out.println("La priority queue max es :"+maxHeap);

        // -- 8. DEQUE (stack y queue)
            // Stack & Queue are obsolete, now the best is to use double-ended-queue
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        System.out.println("Popped : "+ stack.pop());
        stack.push(19); stack.push(2); stack.push(0);
        System.out.println("Encima de la pila tenemos : "+stack.peek());

            //Now, as a queue
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(2); queue.offer(5); queue.offer(0);
        System.out.println("La cola es la siguiente : " + queue);
        System.out.println("El primero en entrar ha sido : "+queue.poll());
        System.out.println("La cola es la siguiente : " + queue);

        // -- 9. COMPARATOR -------------------------------
        int[][] intervals = {{3,4}, {1,2}, {2,3}};
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(intervals));
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        System.out.println(Arrays.deepToString(intervals));

        List<Integer> example = new ArrayList<>(Arrays.asList(3,1,2)); //And sorting arrayLists
        Collections.sort(example);
        System.out.println(example);
        example.sort((a,b) -> b - a );
        System.out.println(example);

        // -- 10. MATH ------------------------------------
        System.out.println(Math.max(2, 6));
        System.out.println(Math.abs(-100));
        System.out.println((int) Math.pow(2, 10));
    }
}
