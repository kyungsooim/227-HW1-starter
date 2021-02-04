import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Add your own comments
 */
public class HtmlValidator {
    private static final String INDENTATION_MARKER = "    ";

    private Queue<HtmlTag> tags;

    /**
     * Create an empty HtmlValidator
     */
    public HtmlValidator() {
        tags = new LinkedList<>();
    }

    /**
     * Create an HtmlValidator with the content of tags
     * @param tags the content of new HtmlValidator
     */
    public HtmlValidator(Queue<HtmlTag> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Initial tags cannot be null.");
        }
        // Create a copy of the input queue
        this.tags = new LinkedList<>(tags);
    }

    /**
     * Add a tag to the end of the HtmlValidator
     * @param tag the tag to be added
     */
    public void addTag(HtmlTag tag) {
        //***************
        //YOUR CODE HERE
        //***************
    }

    /**
     * Get a copy of the tags in the HtmlValidator
     * @return A copy of the tags in the HmtlValidator
     */
    public Queue<HtmlTag> getTags() {
        // return a copy of tags
        return new LinkedList<>(tags);
    }

    /**
     * Remove all tags matching element
     * @param element the type of tag to remove
     */
    public void removeAll(String element) {
        if (element == null) throw new IllegalArgumentException();

        Queue<HtmlTag> filteredTags = new LinkedList<>();
        for (HtmlTag tag : tags) {
            if (!tag.getElement().equalsIgnoreCase(element)) {
                filteredTags.add(tag);
            }
        }
        tags = filteredTags;
    }


    public void validate() {
        Stack<HtmlTag> openTags = new Stack<>();
        for(HtmlTag tag : tags) {

            //***************
            // YOUR CODE HERE
            //***************

        }
        // Deal with unclosed tags
        while (!openTags.isEmpty()) {
            HtmlTag tag = openTags.pop();
            System.out.println("ERROR unclosed tag: " + tag.toString());
        }
    }

    // Helper function to make printing at given indentation more convenient
    private static void printWithIndentation(HtmlTag tag, int indentationLevel) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indentationLevel; i++) {
            sb.append(INDENTATION_MARKER);
        }
        sb.append(tag.toString());
        System.out.println(sb.toString());
    }
}