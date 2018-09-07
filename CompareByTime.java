import java.util.Comparator;

/**
 * CompareByTime class is used to compare two events 
 * based on their starting_time provided the dates of 
 * both the events are same. It implements the compare 
 * function of the Comparator interface.
 * 
 * @author Ritika Singhal, Rudra Gandhi, Joleena Marshall 
 * @copyright 07-21-2018
 * @version 1.0
 */
public class CompareByTime implements Comparator<Event>
{
	/**
	 * This method is overridden from the comparator interface.
	 * It compares events based on starting_time.
	 * @param event1 The first event to be compared
	 * @param event2 The second event to be compared
	 * @return int The result of the comparison.
	 * @Override
	 */	public int compare(Event event1, Event event2)
	{
		return (event1.getStarting_time().compareTo(event2.getStarting_time()));	
	}

}
