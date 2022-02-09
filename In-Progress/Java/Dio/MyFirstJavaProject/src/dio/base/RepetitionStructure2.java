package dio.base;

public class RepetitionStructure2 {
    
    // Other attributes

    private String[] items;

    // For structure
        public void printItems() {

            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i]);
            }
        }

    // enhanced for
    /*  public void printItems() {

            for(String i : items) {
                System.out.println(i);
            }
        }
    */
}
