/*!
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2002-2013 Pentaho Corporation..  All rights reserved.
 */

package org.pentaho.reporting.engine.classic.core.testsupport.font.parser;

import org.pentaho.reporting.engine.classic.core.testsupport.font.LocalFontFamily;
import org.pentaho.reporting.engine.classic.core.testsupport.font.LocalFontMetricsBase;

import java.util.LinkedHashMap;

public class FontMetricsCollection {
  private LinkedHashMap<String, LocalFontMetricsBase> fontMetrics;
  private LinkedHashMap<String, LocalFontFamily> fontFamilies;
  private String fallbackName;

  public FontMetricsCollection() {
    fontMetrics = new LinkedHashMap<String, LocalFontMetricsBase>();
    fontFamilies = new LinkedHashMap<String, LocalFontFamily>();
  }

  public String getFallbackName() {
    return fallbackName;
  }

  public void setFallbackName( final String fallbackName ) {
    this.fallbackName = fallbackName;
  }

  public void defineMetrics( final String source, final LocalFontMetricsBase localFontMetricsBase ) {
    fontMetrics.put( source, localFontMetricsBase );
  }

  public LocalFontMetricsBase getMetrics( final String source ) {
    return fontMetrics.get( source );
  }

  public void addFontFamily( final LocalFontFamily fontFamily ) {
    fontFamilies.put( fontFamily.getFamilyName(), fontFamily );
  }

  public String[] getFontFamilies() {
    return fontFamilies.keySet().toArray( new String[fontFamilies.size()] );
  }

  public LocalFontFamily getFontFamily( final String name ) {
    return fontFamilies.get( name );
  }
}