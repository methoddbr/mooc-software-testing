package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        //nf.find(new int[] {4, 25, 7, 9});

        // this crashes *corrected*
        //nf.find(new int[] {1000, 45645, 3434, 23534, 6});
        nf.find(new int[] {4, 3, 2, 1});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
