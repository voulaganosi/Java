package erg03;

public class QueueEmptyException extends RuntimeException
{
public QueueEmptyException(String err)
{
super(err);
}
}