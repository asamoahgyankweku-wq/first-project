class Assignment {
    public static void main(String[] args) {
        System.out.println("=== Countdown ===");
        int count = 10;
        while (count >= 0) {
            if (count == 0) {
                System.out.println("Launch!");
            } else {
                System.out.println(count);
            }
            count--;
        }


        System.out.println("=== Robot Beeping ===");

        int position = 1;
        while (position <= 8) {
            if (position % 2 == 0) {
                System.out.println("Beep");
            } else {
                System.out.println("Boop");
            }
            position++;
        }

        System.out.println("=== Charger Simulation ===");
        int charger = 0;
        while (charger <= 25) {
            if (charger < 15) {
                System.out.println("Low");
            } else {
                System.out.println("High");
            }
            charger += 5;

            System.out.println("=== Probe Signal ===");
            int level = 0;
            while (level <= 20) {
                System.out.println("Weak");

                System.out.println("=== Light Flicker ===");
                while (level <= 20) if (level < 12) {
                    System.out.println("Weak");
                    level += 0x4;
                } else {
                    System.out.println("Strong");
                    level += 0x4;
                }


            }
        }
    }
}