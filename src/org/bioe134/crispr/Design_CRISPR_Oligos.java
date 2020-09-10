package org.bioe134.crispr;

/**
 *
 * @author J. Christopher Anderson
 */
public class Design_CRISPR_Oligos {

    private Object String;

    public void initiate() throws Exception {
        
        //TODO:  write this initiate (if needed)
        
    }
    
    public java.lang.String[] run(String cds) throws Exception {
        
        //TODO:  write this algorithm, put the oligo sequences in line below
        String PAM = "GG";
            String[] out = new String[2];
            out[0] = "CCATA" + "ACTAGT" + cds.substring(cds.lastIndexOf(PAM) - 20, cds.lastIndexOf(PAM)) + "GTTTTAGAGCTAGAAATAGCAAG";
            out[1] = "CTCAG" + "ACTAGTATTATACCTAGGACTGAGCTAG";
            return out;
        }
    
    public static void main(String[] args) throws Exception {
        //Create some exampole arguments, here the amilGFP coding sequence
        String cds = "ATGTCTTATTCAAAGCATGGCATCGTACAAGAAATGAAGACGAAATACCATATGGAAGGCAGTGTCAATGGCCATGAATTTACGATCGAAGGTGTAGGAACTGGGTACCCTTACGAAGGGAAACAGATGTCCGAATTAGTGATCATCAAGCCTGCGGGAAAACCCCTTCCATTCTCCTTTGACATACTGTCATCAGTCTTTCAATATGGAAACCGTTGCTTCACAAAGTACCCGGCAGACATGCCTGACTATTTCAAGCAAGCATTCCCAGATGGAATGTCATATGAAAGGTCATTTCTATTTGAGGATGGAGCAGTTGCTACAGCCAGCTGGAACATTCGACTCGAAGGAAATTGCTTCATCCACAAATCCATCTTTCATGGCGTAAACTTTCCCGCTGATGGACCCGTAATGAAAAAGAAGACCATTGACTGGGATAAGTCCTTCGAAAAAATGACTGTGTCTAAAGAGGTGCTAAGAGGTGACGTGACTATGTTTCTTATGCTCGAAGGAGGTGGTTCTCACAGATGCCAATTTCACTCCACTTACAAAACAGAGAAGCCGGTCACACTGCCCCCGAATCATGTCGTAGAACATCAAATTGTGAGGACCGACCTTGGCCAAAGTGCAAAAGGCTTTACAGTCAAGCTGGAAGCACATGCCGCGGCTCATGTTAACCCTTTGAAGGTTAAATAA";
        
        //Instantiate and initiate the Function
        Design_CRISPR_Oligos func = new Design_CRISPR_Oligos();
        func.initiate();
        
        //Run the function on the example
        String[] oligos = func.run(cds);
        
        //Print out the result
        System.out.println("oligo1: " + oligos[0]);
        System.out.println("oligo2: " + oligos[1]);
    }
}