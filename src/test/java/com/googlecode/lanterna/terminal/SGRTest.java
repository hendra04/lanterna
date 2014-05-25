/*
 * This file is part of lanterna (http://code.google.com/p/lanterna/).
 *
 * lanterna is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2010-2014 Martin
 */

package com.googlecode.lanterna.terminal;

import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.TestTerminalFactory;
import java.io.IOException;

/**
 *
 * @author Martin
 */
public class SGRTest {
    public static void main(String[] args) throws IOException {
        Terminal rawTerminal = new TestTerminalFactory(args).createTerminal();
        rawTerminal.enterPrivateMode();
        rawTerminal.clearScreen();
        rawTerminal.applyForegroundColor(TextColor.ANSI.RED);
        rawTerminal.enableSGR(Terminal.SGR.BLINK);
        rawTerminal.moveCursor(10, 4);
        rawTerminal.putCharacter('H');
        rawTerminal.putCharacter('e');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('o');
        rawTerminal.putCharacter('!');
        rawTerminal.enableSGR(Terminal.SGR.BLINK);
        rawTerminal.enableSGR(Terminal.SGR.BOLD);
        rawTerminal.moveCursor(10, 5);
        rawTerminal.putCharacter('H');
        rawTerminal.putCharacter('e');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('o');
        rawTerminal.putCharacter('!');
        rawTerminal.enableSGR(Terminal.SGR.BOLD);
        rawTerminal.enableSGR(Terminal.SGR.BORDERED);
        rawTerminal.moveCursor(10, 6);
        rawTerminal.putCharacter('H');
        rawTerminal.putCharacter('e');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('o');
        rawTerminal.putCharacter('!');
        rawTerminal.enableSGR(Terminal.SGR.BORDERED);
        rawTerminal.enableSGR(Terminal.SGR.CIRCLED);
        rawTerminal.moveCursor(10, 7);
        rawTerminal.putCharacter('H');
        rawTerminal.putCharacter('e');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('o');
        rawTerminal.putCharacter('!');
        rawTerminal.enableSGR(Terminal.SGR.CIRCLED);
        rawTerminal.enableSGR(Terminal.SGR.CROSSEDOUT);
        rawTerminal.moveCursor(10, 8);
        rawTerminal.putCharacter('H');
        rawTerminal.putCharacter('e');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('o');
        rawTerminal.putCharacter('!');
        rawTerminal.enableSGR(Terminal.SGR.CROSSEDOUT);
        rawTerminal.enableSGR(Terminal.SGR.FRAKTUR);
        rawTerminal.moveCursor(10, 9);
        rawTerminal.putCharacter('H');
        rawTerminal.putCharacter('e');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('o');
        rawTerminal.putCharacter('!');
        rawTerminal.enableSGR(Terminal.SGR.FRAKTUR);
        rawTerminal.enableSGR(Terminal.SGR.REVERSE);
        rawTerminal.moveCursor(10, 10);
        rawTerminal.putCharacter('H');
        rawTerminal.putCharacter('e');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('o');
        rawTerminal.putCharacter('!');
        rawTerminal.enableSGR(Terminal.SGR.REVERSE);
        rawTerminal.enableSGR(Terminal.SGR.UNDERLINE);
        rawTerminal.moveCursor(10, 11);
        rawTerminal.putCharacter('H');
        rawTerminal.putCharacter('e');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('l');
        rawTerminal.putCharacter('o');
        rawTerminal.putCharacter('!');
        rawTerminal.enableSGR(Terminal.SGR.UNDERLINE);
        rawTerminal.moveCursor(0, 0);
        rawTerminal.flush();
        try {
            while(rawTerminal.readInput() == null) {
                Thread.sleep(1);
            }
        }
        catch(InterruptedException e) {}
        rawTerminal.exitPrivateMode();
    }
}
