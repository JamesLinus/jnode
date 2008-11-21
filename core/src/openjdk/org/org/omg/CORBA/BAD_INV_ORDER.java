/*
 * Copyright 1995-2006 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

package org.omg.CORBA;

/**
 * This exception indicates that the caller has invoked operations in 
 * the wrong order. For example, it can be raised by an ORB if an 
 * application makes an ORB-related call without having correctly 
 * initialized the ORB first.<P>
 * It contains a minor code, which gives more detailed information about
 * what caused the exception, and a completion status. It may also contain
 * a string describing the exception.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 * @since       JDK1.2
 */

public final class BAD_INV_ORDER extends SystemException {

    /**
     * Constructs a <code>BAD_INV_ORDER</code> exception with a default 
     * minor code of 0 and a completion state of COMPLETED_NO.
     */
    public BAD_INV_ORDER() {
	this("");
    }

    /**
     * Constructs a <code>BAD_INV_ORDER</code> exception with the specified detail
     * message, a minor code of 0, and a completion state of COMPLETED_NO.
     *
     * @param s the String containing a detail message
     */
    public BAD_INV_ORDER(String s) {
        this(s, 0, CompletionStatus.COMPLETED_NO);
    }

    /**
     * Constructs a <code>BAD_INV_ORDER</code> exceptionBAD_INV_ORDER with the specified
     * minor code and completion status.
     * @param minor the minor code
     * @param completed an instance of <code>CompletionStatus</code> indicating
     *                  the completion status
     */
    public BAD_INV_ORDER(int minor, CompletionStatus completed) {
        this("", minor, completed);
    }

    /**
     * Constructs a <code>BAD_INV_ORDER</code> exception with the specified detail
     * message, minor code, and completion status.
     * A detail message is a String that describes this particular exception.
     * @param s the String containing a detail message
     * @param minor the minor code
     * @param completed the completion status
     */
    public BAD_INV_ORDER(String s, int minor, CompletionStatus completed) {
        super(s, minor, completed);
    }

}
