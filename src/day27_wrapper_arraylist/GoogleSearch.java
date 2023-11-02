package day27_wrapper_arraylist;

public class GoogleSearch {
    String result = "About 4,110,000 results (0.41 seconds)";
    String[] resArr = result.split(" ");

    String numStr = resArr[1].replace(",", "");
}
