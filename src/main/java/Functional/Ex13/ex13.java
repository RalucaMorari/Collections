package Functional.Ex13;
//13. Gestiunea tranzactiilor 2
//O tranzactie este caracterizata de id, state si amount. (HINT: atribute: id, state si amount)
//Starea tranzactiei (state) este un enum care poate avea valorile FINISHED, CANCELED, PROCESSING.
//Un cont (account) este caracterizat de balance (sold) si un account number (numar de cont) si de o lista de tranzactii (HINT: atribute: number, balance, transactions - care este o lista)
//Avand intr-un main o lista de conturi, care au fiecare lista lor de tranzactii, scrie o metoda care sa returneze suma tranzactiilor cu starea CANCELED din conturile care au soldul mai mare decat 0.
//
//(HINT: stream pe lista de conturi si filter pentru a filtra conturile cu balanta mai mare decat 0, apoi flatMap pentru a ajunge la tranzactiile conturilor si filter pentru a filtra tranzactiile CANCELED)
//
//Rezolva apoi problema si fara expresii lambda.


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Future;

public class ex13 {
    public static void main(String[] args) {
        List<Transaction> transaction1 = Arrays.asList(new Transaction(1,50,State.CANCELED), new Transaction(2, 200, State.PROCESSING));
        List<Transaction> transaction2 = Arrays.asList(new Transaction(3,150, State.CANCELED), new Transaction(2, 20, State.FINISHED));
        List<Account> accountList = Arrays.asList(new Account("111", 200, transaction1), new Account("222", 500, transaction2));

        System.out.println(getSumOfCancelledTransactions(accountList, 200));

        Optional<Integer> sumOptional = accountList.stream()
                .filter(account -> account.getBalance()>200)
                .flatMap(account -> account.getTransactions().stream())
                .filter(transaction -> transaction.getState().equals(State.CANCELED))
                .map(transaction -> transaction.getAmount ())
                .reduce((sum, amount) -> sum+amount);

        System.out.println(sumOptional.get());
    }

    public static Integer getSumOfCancelledTransactions(List<Account> accountList, Integer minBalance) {
        int sum = 0;
        for (Account account: accountList) {
            if (account.getBalance() > minBalance) {
                for (Transaction transaction : account.getTransactions()) {
                    if (transaction.getState().equals(State.CANCELED)) {
                        sum += transaction.getAmount();
                    }
                }
            }
        }
        return sum;
    }
}
