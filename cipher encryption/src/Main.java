import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*********** Welcome to Cypher Encryption ***********");
        System.out.println();

        System.out.println("How do you want to use our encryptor?\n");
        System.out.println("Press 1 : Normal to Encryption");
        System.out.println("Press 2 : Encryption to Normal\n");
        System.out.print("Please enter your choice : ");

        String str_response = scanner.nextLine();
        int response =Integer.parseInt(str_response);
        System.out.println();
        switch (response) {

            case 1: {
                //Taking the input from the user
                System.out.print("Input  : ");
                String str = scanner.nextLine();

                //Initialising the char array
                char[] char_arr_1 = new char[str.length()];

                //Storing the letters in lower case from input string
                char ch = ' ';
                for (int i = 0; i < str.length(); i++) {
                    char_arr_1[i] = str.toLowerCase().charAt(i);
                }

                //Converting the char datatype into int and thereby storing it in the array

                //Input string array
                int[] input_str_arr = new int[char_arr_1.length];

                //Output string array
                int[] output_str_arr = new int[char_arr_1.length];

                for (int i = 0; i < char_arr_1.length; i++) {
                    input_str_arr[i] = (int) char_arr_1[i];
                }

                //Converting the unicode of the input string according to the cypher encryption type
                int j = 0;
                for (int i = 0; i < input_str_arr.length; i++) {
                    if (input_str_arr[i] >= 97 && input_str_arr[i] <= 121) {
                        if (input_str_arr[i] >= 97 && input_str_arr[i] <= 118) {
                            output_str_arr[j++] = input_str_arr[i] + 3;
                        } else if (input_str_arr[i] >= 119 && input_str_arr[i] <= 121) {
                            output_str_arr[j++] = input_str_arr[i] - 22;
                        }
                    } else {
                        output_str_arr[j++] = input_str_arr[i];
                    }
                }

//        System.out.println(Arrays.toString(output_str_arr));

                StringBuilder ans = new StringBuilder();
                for (int i = 0; i < j; i++) {
                    ans.append((char) output_str_arr[i]);
                }
                System.out.println("Output : " + ans);
            }
            break;

            case 2:
            {
                //Taking the input from the user
                System.out.print("Input  : ");
                String str = scanner.nextLine();

                //Initialising the char array
                char[] char_arr_1 = new char[str.length()];

                //Storing the letters in lower case from input string
                char ch = ' ';
                for (int i = 0; i < str.length(); i++) {
                    char_arr_1[i] = str.toLowerCase().charAt(i);
                }

                //Converting the char datatype into int and thereby storing it in the array

                //Input string array
                int[] input_str_arr = new int[char_arr_1.length];

                //Output string array
                int[] output_str_arr = new int[char_arr_1.length];

                for (int i = 0; i < char_arr_1.length; i++) {
                    input_str_arr[i] = (int) char_arr_1[i];
                }

                //Converting the unicode of the input string according to the cypher encryption type
                int j = 0;
                for (int i = 0; i < input_str_arr.length; i++) {
                    if (input_str_arr[i] >= 97 && input_str_arr[i] <= 121) {
                        if (input_str_arr[i] >= 100 && input_str_arr[i] <= 121) {
                            output_str_arr[j++] = input_str_arr[i] - 3;
                        } else if (input_str_arr[i] >= 97 && input_str_arr[i] <= 99) {
                            output_str_arr[j++] = input_str_arr[i] + 22;
                        }
                    } else {
                        output_str_arr[j++] = input_str_arr[i];
                    }
                }

//        System.out.println(Arrays.toString(output_str_arr));

                StringBuilder ans = new StringBuilder();
                for (int i = 0; i < j; i++) {
                    ans.append((char) output_str_arr[i]);
                }
                System.out.println("Output : " + ans);
            }

                break;

            default:
                System.out.println("Please enter the valid response!");
        }

        //Setting up the scanner


        System.out.println("\n*********** Thanks for using it ***********\n");
    }
}