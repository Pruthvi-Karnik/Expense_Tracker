package expenseTracker.model;
    public class Expense {
        private String category;
        private double amount;
        private String date;

        public Expense(String category, double amount, String date) {
            this.category = category;
            this.amount = amount;
            this.date = date;
        }

        public  String toFileString() {
            return category + "," + amount + "," + date;
        }

        public static Expense fromFileString(String line) {
            String[] parts = line.split(",");

            if (parts.length < 3) {
                System.out.println("Skipping invalid data: " + line);
                return null;
            }

            return new Expense(parts[0], Double.parseDouble(parts[1]), parts[2]);
        }

        public String getCategory() {
            return category;
        }

        public double getAmount() {
            return amount;
        }

        public String getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "Category: " + category + ", Amount: " + amount + ", Date: " + date;
        }
    }