package encryption;

import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String operation = in.nextLine();

        var processors = new ArrayList<Processor>();
        int pseudoRandomNumber = in.nextInt();

        if (operation.equals("ENCODE"))
            processors.add(new CaesarShiftEncoder(pseudoRandomNumber));
        else
            processors.add(new CaesarShiftDecoder(pseudoRandomNumber));

        if (in.hasNextLine()) {
            in.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            String rotor = in.nextLine();

            if (operation.equals("ENCODE"))
                processors.add(new RotorEncoder(rotor));
            else
                processors.add(new RotorDecoder(rotor));
        }

        String message = in.nextLine();

        if (operation.equals("ENCODE")) {
            for (var p : processors)
                message = p.process(message);
        }
        else{
            for (var i = processors.size() - 1; i >= 0; i--) {
                var p = processors.get(i);
                message = p.process(message);
            }
        }

        System.out.println(message);
    }
}
