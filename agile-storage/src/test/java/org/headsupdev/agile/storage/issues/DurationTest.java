/*
 * HeadsUp Agile
 * Copyright 2009-2012 Heads Up Development Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.headsupdev.agile.storage.issues;

import junit.framework.TestCase;

/**
 * Lots of tests for the Duration class
 *
 * @author Andrew Williams
 * @since 1.0
 */
public class DurationTest
        extends TestCase
{
    public void testHoursToString()
    {
        Duration hours = new Duration( 5 );
        TestCase.assertEquals( "Wrong rendering for hours duration", "5h", hours.toString() );

        hours = new Duration( 5, Duration.UNIT_HOURS );
        TestCase.assertEquals( "Wrong rendering for hours duration", "5h", hours.toString() );
    }

    public void testDaysToString()
    {
        Duration hours = new Duration( 8 );
        TestCase.assertEquals( "Wrong rendering for days duration", "1d", hours.toString() );

        hours = new Duration( 1, Duration.UNIT_DAYS );
        TestCase.assertEquals( "Wrong rendering for days duration", "1d", hours.toString() );
    }

    public void testDaysHoursToString()
    {
        Duration hours = new Duration( 12 );
        TestCase.assertEquals( "Wrong rendering for days + hours duration", "1d 4h", hours.toString() );

        hours = new Duration( 12, Duration.UNIT_HOURS );
        TestCase.assertEquals( "Wrong rendering for days + hours duration", "1d 4h", hours.toString() );
    }

    public void testWeeksDaysHoursToString()
    {
        Duration hours = new Duration( 51 );
        TestCase.assertEquals( "Wrong rendering for weeks + days + hours duration", "1w 1d 3h", hours.toString() );

        hours = new Duration( 51, Duration.UNIT_HOURS );
        TestCase.assertEquals( "Wrong rendering for weeks + days + hours duration", "1w 1d 3h", hours.toString() );
    }

    public void testWeeksDaysToString()
    {
        Duration hours = new Duration( 48 );
        TestCase.assertEquals( "Wrong rendering for weeks + days duration", "1w 1d", hours.toString() );

        hours = new Duration( 6, Duration.UNIT_DAYS );
        TestCase.assertEquals( "Wrong rendering for weeks + days duration", "1w 1d", hours.toString() );
    }

    public void testWeeksHoursToString()
    {
        Duration hours = new Duration( 47 );
        TestCase.assertEquals( "Wrong rendering for weeks + hours duration", "1w 7h", hours.toString() );

        hours = new Duration( 47, Duration.UNIT_HOURS );
        TestCase.assertEquals( "Wrong rendering for weeks + hours duration", "1w 7h", hours.toString() );
    }
}
