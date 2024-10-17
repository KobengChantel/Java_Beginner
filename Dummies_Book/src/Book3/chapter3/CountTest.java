package Book3.chapter3;




    class CountTest1 {
        private static int instanceCount = 0;

        public CountTest1() {
            ++instanceCount;
        }

        public static int getInstanceCount() {
            return instanceCount;
        }
    }

