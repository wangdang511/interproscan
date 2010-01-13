package uk.ac.ebi.interpro.scan.model.raw.alignment;

/**
 * Encode sequence alignment.
 *
 * @author  Antony Quinn
 * @version $Id$
 */
public interface AlignmentEncoder {

    public String encode(String alignment);

    /**
     * Provides information about the encoded alignment
     *
     * @author  Antony Quinn
     */
    public interface Parser {
        public int getMatchCount();
        public int getInsertCount();
        public int getDeleteCount();
    }

}
