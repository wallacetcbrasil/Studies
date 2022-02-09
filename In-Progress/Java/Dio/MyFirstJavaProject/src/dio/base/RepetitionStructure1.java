package dio.base;

public class RepetitionStructure1 {
    
    // Other attributes
        private String[] items;

    // while structure
        public void printItems() {
            int i = 0;

            while (i < items.length) {
                System.out.println(items[i]);
                i++;
            }
        }

    // do-while structure
    /*  public void printItems() {
            int i = 0;

            do {
                System.out.println(items[i]);
                i++;
            } while (i < items.length);
        }
    */
 
}
