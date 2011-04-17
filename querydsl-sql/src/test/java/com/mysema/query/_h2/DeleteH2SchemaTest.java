/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query._h2;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;

import com.mysema.query.Connections;
import com.mysema.query.DeleteBaseTest;
import com.mysema.query.Target;
import com.mysema.query.sql.H2Templates;
import com.mysema.testutil.Label;

@Label(Target.H2)
public class DeleteH2SchemaTest extends DeleteBaseTest{

    @BeforeClass
    public static void setUpClass() throws Exception {
        Connections.initH2();
    }

    @Before
    public void setUp() throws SQLException {
        templates = new H2Templates(){{
            setPrintSchema(true);
            newLineToSingleSpace();
        }};
        super.setUp();
    }

}
