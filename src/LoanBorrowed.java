public class LoanBorrowed {
        // Constants for interest rates and maximum loan terms
        private static final double INDIVIDUAL_INTEREST_RATE = 0.012; // 1.2% per month
        private static final double GROUP_INTEREST_RATE = 0.01; // 1% per month
        private static final double GROUP_LOAN_INTEREST_RATE = 0.008; // 0.8% per month
        private static final int MAX_INDIVIDUAL_LOAN_TERM = 36; // 3 years in months
        private static final int MAX_GROUP_LOAN_TERM = 48; // 4 years in months
        private static final int MAX_GROUP_LOAN_TERM_GROUP = 60; // 5 years in months

        // Method to calculate individual loan amount
        public static double calculateIndividualLoan(double shareContribution) {
            return shareContribution * 3;
        }

        // Method to calculate group loan amount
        public static double calculateGroupLoan(double shareContribution) {
            return shareContribution * 4;
        }

        // Method to calculate group loan amount (for the group as a whole)
        public static double calculateGroupLoanForGroup(double totalShareContribution) {
            return totalShareContribution * 3;
        }

        // Method to calculate monthly loan repayment for an individual
        public static double calculateMonthlyRepaymentForIndividual(double principalAmount, int loanTerm) {
            double monthlyInterestRate = INDIVIDUAL_INTEREST_RATE;
            return (principalAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTerm));
        }

        // Method to calculate monthly loan repayment for a group
        public static double calculateMonthlyRepaymentForGroup(double principalAmount, int loanTerm) {
            double monthlyInterestRate = GROUP_INTEREST_RATE;
            return (principalAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTerm));
        }

        // Method to calculate monthly loan repayment for a group loan
        public static double calculateMonthlyRepaymentForGroupLoan(double principalAmount, int loanTerm) {
            double monthlyInterestRate = GROUP_LOAN_INTEREST_RATE;
            return (principalAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTerm));
        }

        // Method to check if the loan term is within the allowed limit
        public static boolean isLoanTermValid(int loanTerm, boolean isGroupLoan, boolean isGroup) {
            if (isGroupLoan) {
                return loanTerm <= (isGroup ? MAX_GROUP_LOAN_TERM_GROUP : MAX_GROUP_LOAN_TERM);
            } else {
                return loanTerm <= MAX_INDIVIDUAL_LOAN_TERM;
            }
        }
    }

