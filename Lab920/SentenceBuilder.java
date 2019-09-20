
/**
 * Write a description of class SentenceBuilder here.
 *
 * @author (Kayla Garcia)
 * @version (920)
 */
public class SentenceBuilder
{
    String[] nouns = {"dog", "cat", "truck", "plane", "ball", "tiger"};
    String[] verbs = {"walks","laughs","coughs","plays","runs", "cuts"};
    String[] adjectives = {"small", "large", "yellow", "blue","sily","nice"};
    String[] determiners = {"the", "my", "your", "his", "hers", "our", "their"};
    String[] adverbs = {"quickly", "happily", "smoothly", "often", "very", "never"};
    String[] prepositions = {"over", "near", "on top of", "behind", "next to", "inside of", "under" };
    String randomSentence =  getNounPhrase() + " " +getVerbPhrase() + " "+  getPrepositionalPhrase();
    public void loadSentences(){
         randomSentence =  getNounPhrase() +" "+ getVerbPhrase() +" "+  getPrepositionalPhrase();
    } 

    public String getSentence() {
        return randomSentence;
    }

    public String getNounPhrase(){
        String s = "";
        s = getRandomDeterminer();
        s = s + " "+getRandomAdjective();
        s = s + " "+getRandomVerb();
        return s;
    }

    public String getPrepositionalPhrase(){
        String s = "";
        s= getRandomPreposition();
        s= s + " "+getRandomDeterminer();
        s = s+ " " +getRandomAdjective();
        s= s+ " "+getRandomNoun();
        return s;
    }

    public String getVerbPhrase(){
        String s ="";
        s= getRandomAdverb();
        s= s+ " "+getRandomVerb();
        return s;
    }

    public String getRandomNoun(){
        int n = ((int)Math.random()*nouns.length); 
        return nouns[n];
        
    }
    
    

    public String getRandomVerb(){
        int n = ((int)Math.random()*verbs.length); 
        return verbs[n];
    }

    public String getRandomAdjective(){
        int n = ((int)Math.random()*adjectives.length); 
        return adjectives[n];
    }

    public String getRandomAdverb(){
        int n = ((int)Math.random()*adverbs.length); 
        return adverbs[n];
    }

    public String getRandomDeterminer(){
        int n = ((int)Math.random()*determiners.length); 
        return determiners[n];
    }

    public String getRandomPreposition(){
        int n = ((int)Math.random()*prepositions.length); 
        return prepositions[n];
    }

}
