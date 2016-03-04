package network.thunder.core.communication.processor.exceptions;

/**
 * Created by matsjerratsch on 11/01/2016.
 */
public class LNEstablishException extends LNException {
    public LNEstablishException (String s) {
        super(s);
    }

    public LNEstablishException (Throwable cause) {
        super(cause);
    }

    @Override
    public boolean shouldDisconnect () {
        return true;
    }
}
