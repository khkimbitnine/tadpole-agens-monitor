/*******************************************************************************
 * Copyright (c) 2016 EclipseSource and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralf Sternberg - initial API and implementation
 ******************************************************************************/
package org.eclipse.rap.addons.chart;

import org.eclipse.swt.graphics.RGB;

/**
 * Common D3 color definitions. Can be used to set the color scale of <code>NvChart</code>.
 *
 * @see "https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors"
 */
public class Colors {

  public static final RGB[] CATEGORY_10 = {
    new RGB( 0x1f, 0x77, 0xb4 ),
    new RGB( 0xff, 0x7f, 0x0e ),
    new RGB( 0x2c, 0xa0, 0x2c ),
    new RGB( 0xd6, 0x27, 0x28 ),
    new RGB( 0x94, 0x67, 0xbd ),
    new RGB( 0x8c, 0x56, 0x4b ),
    new RGB( 0xe3, 0x77, 0xc2 ),
    new RGB( 0x7f, 0x7f, 0x7f ),
    new RGB( 0xbc, 0xbd, 0x22 ),
    new RGB( 0x17, 0xbe, 0xcf )
  };

  public static final RGB[] CATEGORY_20 = {
    new RGB( 0x1f, 0x77, 0xb4 ),
    new RGB( 0xae, 0xc7, 0xe8 ),
    new RGB( 0xff, 0x7f, 0x0e ),
    new RGB( 0xff, 0xbb, 0x78 ),
    new RGB( 0x2c, 0xa0, 0x2c ),
    new RGB( 0x98, 0xdf, 0x8a ),
    new RGB( 0xd6, 0x27, 0x28 ),
    new RGB( 0xff, 0x98, 0x96 ),
    new RGB( 0x94, 0x67, 0xbd ),
    new RGB( 0xc5, 0xb0, 0xd5 ),
    new RGB( 0x8c, 0x56, 0x4b ),
    new RGB( 0xc4, 0x9c, 0x94 ),
    new RGB( 0xe3, 0x77, 0xc2 ),
    new RGB( 0xf7, 0xb6, 0xd2 ),
    new RGB( 0x7f, 0x7f, 0x7f ),
    new RGB( 0xc7, 0xc7, 0xc7 ),
    new RGB( 0xbc, 0xbd, 0x22 ),
    new RGB( 0xdb, 0xdb, 0x8d ),
    new RGB( 0x17, 0xbe, 0xcf ),
    new RGB( 0x9e, 0xda, 0xe5 )
  };

  public static final RGB[] CATEGORY_20B = {
    new RGB( 0x39, 0x3b, 0x79 ),
    new RGB( 0x52, 0x54, 0xa3 ),
    new RGB( 0x6b, 0x6e, 0xcf ),
    new RGB( 0x9c, 0x9e, 0xde ),
    new RGB( 0x63, 0x79, 0x39 ),
    new RGB( 0x8c, 0xa2, 0x52 ),
    new RGB( 0xb5, 0xcf, 0x6b ),
    new RGB( 0xce, 0xdb, 0x9c ),
    new RGB( 0x8c, 0x6d, 0x31 ),
    new RGB( 0xbd, 0x9e, 0x39 ),
    new RGB( 0xe7, 0xba, 0x52 ),
    new RGB( 0xe7, 0xcb, 0x94 ),
    new RGB( 0x84, 0x3c, 0x39 ),
    new RGB( 0xad, 0x49, 0x4a ),
    new RGB( 0xd6, 0x61, 0x6b ),
    new RGB( 0xe7, 0x96, 0x9c ),
    new RGB( 0x7b, 0x41, 0x73 ),
    new RGB( 0xa5, 0x51, 0x94 ),
    new RGB( 0xce, 0x6d, 0xbd ),
    new RGB( 0xde, 0x9e, 0xd6 )
  };

  private Colors() {
    // prevent instantiation
  }

}