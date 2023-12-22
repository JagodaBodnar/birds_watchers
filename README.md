### Instructions
Exercise from  https://exercism.org/tracks/java/exercises/bird-watcher
You're an avid bird watcher that keeps track of how many birds have visited your garden in the last seven days.

You have six tasks, all dealing with the numbers of birds that visited your garden.

1. Check what the counts were last week </br>
   For comparison purposes, you always keep a copy of last week's counts nearby, which were: 0, 2, 5, 3, 7, 8 and 4. Implement the BirdWatcher.getLastWeek() method that returns last week's counts:

>BirdWatcher.getLastWeek(); </br>
>// => [0, 2, 5, 3, 7, 8, 4]

2. Check how many birds visited today </br>
   Implement the BirdWatcher.getToday() method to return how many birds visited your garden today.
   The bird counts are ordered by day, with the first element being the count of the oldest day, and the last element being today's count.

>int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 }; </br>
>BirdWatcher birdCount = new BirdWatcher(birdsPerDay);</br>
>birdCount.getToday(); </br>
>// => 1

3. Increment today's count </br>
   Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:

>int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 }; </br>
BirdWatcher birdCount = new BirdWatcher(birdsPerDay); </br>
birdCount.incrementTodaysCount(); </br>
birdCount.getToday(); </br>
// => 2

4. Check if there was a day with no visiting birds
   Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if there was a day at which zero birds visited the garden; otherwise, return false:

>int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 }; </br>
BirdWatcher birdCount = new BirdWatcher(birdsPerDay); </br>
birdCount.hasDayWithoutBirds(); </br>
// => true

5. Implement the BirdWatcher.getCountForFirstDays() method that returns the number of birds that have visited your garden from the start of the week, but limit the count to the specified number of days from the start of the week.

>int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 }; </br>
BirdWatcher birdCount = new BirdWatcher(birdsPerDay); </br>
birdCount.getCountForFirstDays(4); </br>
// => 14

6. Some days are busier that others. A busy day is one where five or more birds have visited your garden. Implement the BirdWatcher.getBusyDays() method to return the number of busy days:

>int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 }; </br>
BirdWatcher birdCount = new BirdWatcher(birdsPerDay); </br>
birdCount.getBusyDays(); </br>
// => 2