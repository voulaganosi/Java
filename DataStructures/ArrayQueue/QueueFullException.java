package erg03;

public class QueueFullException extends RuntimeException
{
public QueueFullException(String err)
{
super(err);
}
}