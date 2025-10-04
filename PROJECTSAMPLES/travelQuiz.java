
import java.util.InputMismatchException;
import java.util.Scanner;

class Questions {
    private int Answer;

    public Questions(Scanner scan, String questionDescription) {
        while (true) { 
            try {
                System.out.print(questionDescription);
                this.Answer = scan.nextInt();
                if (this.Answer < 1 || this.Answer > 4) {
                    System.out.println("That's not a valid answer!\n");
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.err.println("Oop, Try answering an integer\n");
                scan.next();
            }
        }
    }

    public int GetAnswer() {
        return Answer;
    }
}

public class travelQuiz {

    public static int ScoreChecker(int Answer) {
        int score = 0; 
        switch (Answer) {
            case 1 -> {
                score += 1;
                break;
            }
            case 2 -> {
                score += 2;
                break;
            }
               
            case 3 -> {
                score += 3;
                break;
            }  
            case 4 -> {
                score += 4;
                break;
            }
            default -> {
                throw new AssertionError();
            }
                
        }

        return score;
    }

    public static void line() {
        System.out.println("+----------------Adelle's Border!!!------------------+");
    }
   public static void main(String[] args) {
        int score = 0;
        int answer;
        try(Scanner scan = new Scanner(System.in)) {
            line();
            Questions question1 = new Questions(scan, "Which activity is best suited for a relaxing day at the beach?\n1) Making sandcastles and sunbathing \n2) Hiking through lush trails\n3) Exploring Historical Monuments\n4) Harvesting crops in a farm\nEnter Answer here! ");
            answer = question1.GetAnswer();
            score += ScoreChecker(answer);
            line();
            Questions question2 = new Questions(scan, "If you're looking for an adventure, where would you go to try rock climbing and rappelling?\n1) A sparkling beachfront\n2) A mountanious region\n3) A bustling city center\n4) A lush rice field\nEnter Answer here! ");
            answer = question2.GetAnswer();
            score += ScoreChecker(answer);
            line();
            Questions question3 = new Questions(scan, "What's the best way to experience the vibrant culture and nightlife?\n1) Swimming in the crystal clear waters\n2) Camping in a secluded mountain\n3) Exploring a metropolitan city\n4) Walking through a rice field\nEnter Answer here! ");
            answer = question3.GetAnswer();
            score += ScoreChecker(answer);
            line();
            Questions question4 = new Questions(scan, "Where would you find the most stunning sunsets and panoramic views?\n1) A crowded beach\n2) A mountaintop viewpoint\n3) A lively city street\n4) A vast open field\nEnter Answer here! ");
            answer = question4.GetAnswer();
            score += ScoreChecker(answer);
            line();
            Questions question5 = new Questions(scan, "Which location is ideal for bird watching and enjoying the tranquility of nature?\n1) A district coastal resort\n2) A historical city\n3) A busy shopping district\n4) A quiet field or farm\nEnter Answer here! ");
            answer = question5.GetAnswer();
            score += ScoreChecker(answer);
            line();
            Questions question6 = new Questions(scan, "If you want to see historical landmarks and museums, where should you go?\n1) A sandy beach\n2) A mountain resort \n3) A city with a rich history\n4) A farming area\nEnter Answer here! ");
            answer = question6.GetAnswer();
            score += ScoreChecker(answer);
            line();
            Questions question7 = new Questions(scan, "Where can you typically find fresh produce and local delicacies?\n1) A beachside restaurant\n2) A or farm mountain village\n3) A modern city mall\n4) A sprawling field or farm\nEnter Answer here! ");
            answer = question7.GetAnswer();
            score += ScoreChecker(answer);
            line();
            Questions question8 = new Questions(scan, "Which place is best for a picnic with a view?\n1) A crowded beach\n2) A mountain with a scenic overlook\n3) A bustling city park\n4) A rice field\nEnter Answer here! ");
            answer = question8.GetAnswer();
            score += ScoreChecker(answer);
            line();
            Questions question9 = new Questions(scan, "Where would you go to enjoy water sports like surfing and jet skiing?\n1) A beach with waves\n2) A mountainous region\n3) A city with a river\n4) A field with a lake\nEnter Answer here! ");
            answer = question9.GetAnswer();
            score += ScoreChecker(answer);
            line();
            Questions question10 = new Questions(scan, "What is the best place to experience local festivals and cultural events?\n1) A beach resort\n2) A mountain village remote field\n3) A metropolitan city\n4) A remote field \nEnter Answer here! ");
            answer = question10.GetAnswer();
            score += ScoreChecker(answer);
            line();


            if (score <= 10) {
                System.out.println("""
            Beach Resort: Shangri-La's Boracay Resort and Spa
            Stunning Beaches: Located on the famous White Beach, known for its powdery white sand and crystal-clear waters.
            Luxurious Amenities: Offers world-class facilities, including a spa, multiple dining options, and private villas.
            Activities Galore: Enjoy water sports, sunset cruises, and vibrant nightlife just a stone's throw away.
            Eco-Friendly Practices: Committed to sustainability and preserving the natural beauty of Boracay.
            """);
            } else if (score <= 20) {
                System.out.println("""
            Mountain Village: Maligcong, Mountain Province
            Breathtaking Scenery: Surrounded by lush rice terraces and stunning mountain views, perfect for nature lovers.
            Cultural Richness: Experience the local culture and traditions of the Igorot people, including their unique festivals.
            Adventure Opportunities: Great for hiking, trekking, and exploring nearby peaks like Mount Kupapey.
            Peaceful Atmosphere: A tranquil escape from the hustle and bustle of city life, ideal for relaxation.
            """);
            } else if (score <= 30) {
                System.out.println("""
            City: Cebu City
            Historical Significance: Known as the "Queen City of the South," it has rich history and landmarks like Magellan's Cross and Fort San Pedro.
            Vibrant Culture: A melting pot of cultures with lively festivals, delicious local cuisine, and friendly locals.
            Accessibility: Serves as a gateway to other beautiful destinations in the Visayas, including beaches and diving spots.
            Modern Amenities: Offers a mix of urban conveniences, shopping malls, and entertainment options.
            """);
            } else if (score <= 40) {
                System.out.println("""
            Province: Palawan
            Natural Wonders: Home to UNESCO World Heritage Sites like the Puerto Princesa Subterranean River and the stunning El Nido and Coron islands.
            Diverse Ecosystems: Rich in biodiversity, perfect for snorkeling, diving, and exploring unique wildlife.
            Adventure and Relaxation: Offers both thrilling activities like island hopping and serene spots for relaxation.
            Cultural Heritage: Experience the rich culture of indigenous groups and local communities.
            """);
            }
        }
   } 
}





