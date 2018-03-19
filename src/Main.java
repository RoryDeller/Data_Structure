public class Main {


        private static String[] list = new String [100];
        private static int listLength = 0;
        private static void add(String item){
            list[listLength] = item;
            listLength++;
        }

        private static String get(int index){
            return list[index];
        }

        private static void clearList(){
            listLength = 0;

        }


        private static String[] stack = new String[100];
        private static int stackHeight = 0;
        private static void push(String item){}
        private static void pop(){}
        private static void clearStack(){}

        private static String[] queue = new String[100];
        private static int queueStart= 0;
        private static int queueLength = 0;
        private static void enqueue(String item){}
        //private static String dequeue(){}
        private static void clearQueue(){}

        public static void main(String[] args) {
            add("Red");
            add("Blue");
            add("Green");
            add("Yellow");
            System.out.println(get(2));
            clearList();
            add("Purple");
            System.out.println(get(0));

        }





}
