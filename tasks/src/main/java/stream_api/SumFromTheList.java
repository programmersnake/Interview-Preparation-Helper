package stream_api;

import java.util.List;

public class SumFromTheList {

    public int sumElementsFromTheList(List<String> inputList) {
        return inputList.stream()
                .filter(s -> {
                    try {
                        Integer.parseInt(s);
                        return true;
                    } catch (NumberFormatException exception) {
                        return false;
                    }
                })
                .mapToInt(Integer::parseInt)
                .sum();
    }

}
