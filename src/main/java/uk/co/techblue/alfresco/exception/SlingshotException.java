package uk.co.techblue.alfresco.exception;

public class SlingshotException extends AlfrescoServiceException{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1935820902227952340L;

	/**
     * Instantiates a new user exception.
     * 
     * @param message the message
     * @param cause the cause
     */
    public SlingshotException(final String message,final  Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new user exception.
     * 
     * @param message the message
     */
    public SlingshotException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new user exception.
     * 
     * @param cause the cause
     */
    public SlingshotException(final Throwable cause) {
        super(cause);
    }

}
