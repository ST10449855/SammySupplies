<H>Sammy Supplies</H>
<h1>START</h1>
    <p>DISPLAY "Sammy's Seashore Supplies"

    INPUT "Enter the number of minutes you rented the equipment:" INTO minutesRented

    SET hoursRented = minutesRented DIV 60
    SET additionalMinutes = minutesRented MOD 60
    SET totalCost = (hoursRented * 400) + additionalMinutes

    DISPLAY "Hours: " + hoursRented
    DISPLAY "Minutes: " + additionalMinutes
    DISPLAY "Total cost: R" + totalCost</p>
<h1>END</h1>
