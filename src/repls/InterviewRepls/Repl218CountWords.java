package repls.InterviewRepls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl218CountWords {
    public static void main(String[] args) {
        List<String> deviceNames=new ArrayList<>();
        deviceNames.add("switch");
        deviceNames.add("tv");
        deviceNames.add("switch");
        deviceNames.add("tv");
        deviceNames.add("switch");
        deviceNames.add("tv");

        System.out.println(countDeviceNames(deviceNames));
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {

        String[] uniqueNames = new String[deviceNames.size()];

        for (int i = 0; i < deviceNames.size(); i++) {

            String name = deviceNames.get(i);
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {

                if (uniqueNames[j].equals(name)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {

                uniqueNames[i] = name;

            } else {

                int id = 1;
                boolean exists = true;

                while (exists) {
                    exists = false;

                    for (int j = 0; j < i; j++) {

                        if (uniqueNames[j].equals(name + id)) {
                            exists = true;
                            id++;
                            break;
                        }
                    }
                }
                uniqueNames[i] = name + id;
            }
        }

        return Arrays.asList(uniqueNames);
    }
}
