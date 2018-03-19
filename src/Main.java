public class Main {


        private static String[] list = new String [100];
        private static int listLength = 0;
        private static void add(String item){
            if (listLength == 100) {
                System.out.println("List is already full");
                return;
            } else {
                list[listLength++] = item;
            }
        }

        private static String get(int index){
            if (index >= listLength){
                System.out.println("Index is bigger than list size");
                return "";
            } else {
                return list[index];
            }
        }

        private static void clearList(){
            listLength = 0;

        }


        private static String[] stack = new String[100];
        private static int stackHeight = 0;
        private static void push(String item){
            if (stackHeight >= 100){
                System.out.println("Stack is already full");
            } else {
                stack[stackHeight++] = item;
            }
        }
        private static String pop(){
            if(stackHeight == 0){
                System.out.println("Stack is already empty");
                return "";
            } else {
                return stack[--stackHeight];
            }
        }
        private static void clearStack(){
            stackHeight = 0;
        }

        private static String[] queue = new String[100];
        private static int queueStart= 0;
        private static int queueLength = 0;
        private static void enqueue(String item){ // Add an item; end of queue
            if (queueLength == 100) {
                System.out.println("Queue is already full");
            }    else {
                queue[(queueStart + queueLength++) % 100] = item;
            }
        }
        private static String dequeue(){ // Remove and item end of queue
            if(queueLength ==0) {
            System.out.println("Queue is already empty");
            return "";
            }else {
                queueLength--;
                return queue[queueStart++];
            }
        }
        private static void clearQueue(){
            queueLength = 0;
            queueStart = 0;
        }

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
