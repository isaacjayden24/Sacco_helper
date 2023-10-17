class Main {
 public static void main(String[] args) {

     double individualShareContribution = 1000.0; // Example individual share contribution
     double groupShareContribution = 2000.0; // Example group share contribution
     int loanTerm = 24; // Example loan term in months
     boolean isGroupLoan = true; // Example for a group loan
     boolean isGroup = true; // Example for a group (as opposed to an individual)
     //create an instance of a loanBorrowed class


     // Calculate individual loan amount
     double individualLoanAmount = LoanBorrowed.calculateIndividualLoan(individualShareContribution);
     System.out.println("Individual Loan Amount: " + individualLoanAmount);

     // Calculate group loan amount
     double groupLoanAmount = LoanBorrowed.calculateGroupLoan(groupShareContribution);
     System.out.println("Group Loan Amount: " + groupLoanAmount);

     // Calculate group loan amount for the group as a whole
     double groupLoanAmountForGroup = LoanBorrowed.calculateGroupLoanForGroup(groupShareContribution);
     System.out.println("Group Loan Amount for the Group: " + groupLoanAmountForGroup);

     // Calculate monthly repayment for an individual loan
     double monthlyRepaymentForIndividual = LoanBorrowed.calculateMonthlyRepaymentForIndividual(individualLoanAmount, loanTerm);
     System.out.println("Monthly Repayment for Individual Loan: " + monthlyRepaymentForIndividual);

     // Calculate monthly repayment for a group loan
     double monthlyRepaymentForGroup = LoanBorrowed.calculateMonthlyRepaymentForGroup(groupLoanAmount, loanTerm);
     System.out.println("Monthly Repayment for Group Loan: " + monthlyRepaymentForGroup);

     // Check if the loan term is valid
     boolean isLoanTermValid = LoanBorrowed.isLoanTermValid(loanTerm, isGroupLoan, isGroup);
     System.out.println("Is Loan Term Valid? " + isLoanTermValid);

     RepaymentInterest obj7 = new RepaymentInterest();

     // Call the repayment method of the RepaymentInterest instance
     obj7.repayment();
 }
}













