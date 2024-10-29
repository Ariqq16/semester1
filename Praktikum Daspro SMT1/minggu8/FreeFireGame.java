package minggu8;
import java.util.Scanner;
public class FreeFireGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerHealth = 100;
        int enemyHealth = 15;
        int healingUses = 3;
        int akDamage = 30;
        int famasDamage = 20;
        int healingAmount = 25;

        System.out.println("Welcome to Free Fire Game!");

        while (playerHealth > 0 && enemyHealth > 0) {
            // Enemy attacks first
            playerHealth -= 10; // Example enemy attack damage
            System.out.println("The enemy attacks! Your health is now: " + playerHealth);

            if (playerHealth <= 0) {
                System.out.println("You have been defeated!");
                break;
            }

            // Player's turn
            System.out.println("Choose your action: 1. Attack 2. Heal 3. Evade");
            int action = sc.nextInt();

            switch (action) {
                case 1: // Attack
                    System.out.println("Choose your weapon: 1. AK 2. Famas");
                    int weapon = sc.nextInt();
                    int damage = (weapon == 1) ? akDamage : famasDamage;
                    enemyHealth -= damage;
                    System.out.println("You attacked the enemy! Enemy health is now: " + enemyHealth);
                    break;

                case 2: // Heal
                    if (healingUses > 0) {
                        playerHealth += healingAmount;
                        healingUses--;
                        System.out.println("You healed yourself! Your health is now: " + playerHealth);
                        System.out.println("Remaining healing uses: " + healingUses);
                    } else {
                        System.out.println("No healing uses left!");
                    }
                    break;

                case 3: // Evade
                    System.out.println("You evaded the enemy's attack!");
                    if (playerHealth > enemyHealth) {
                        enemyHealth += (int) (playerHealth * 0.1);
                        System.out.println("Enemy's health increased by 10% of your health. Enemy health is now: " + enemyHealth);
                    }
                    break;

                default:
                    System.out.println("Invalid action. Try again.");
                    break;
            }

            // Check if enemy is defeated
            if (enemyHealth <= 0) {
                System.out.println("Congratulations! You defeated the enemy!");
                break;
            }
        }

        sc.close();
    }
}
 
