package hometasks.task1;

/**
 * Thrown to indicate that a method has a logical error
 */
class LogicException extends Exception {
    LogicException(String message){ super(message); }
    LogicException(){ super(); }
}
