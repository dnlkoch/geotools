/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2009-2011, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.data.complex.filter;

import org.geotools.data.complex.FeatureTypeMapping;

/**
 * @author Russell Petty (GeoScience Victoria)
 * @version $Id$
 */
public class UnmappingFilterVisitorFactory {
    public static UnmappingFilterVisitor getInstance(FeatureTypeMapping mapping) {
        return new UnmappingFilterVisitor(mapping);
    }
}
