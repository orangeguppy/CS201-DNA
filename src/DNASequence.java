// Group Name (e.g. GXTX) : 
// 
// Instructions  
// 1. You will only submit this file and output_data10000.txt_verify1000.txt.txt in eLearn
// 2. You are only allowed to use the Java Standard Library classes
// 3. Do not modify the variables and methods given except for the implementation of HashCode()
// 4. You can create additional Private variables and methods
// 5. Do not modify any other files to execute the application
// 6. Refer to the project documents write-up and Piazza for clarifications

public class DNASequence {

    private String sequence;

    public DNASequence(String sequence) {
        this.sequence = sequence;
    }
    public String getSequence(){
        return sequence;
    }

    public String toString() {
        return sequence;
    }

    public int hashCode() {
        return sequence.charAt(0);
    }
}