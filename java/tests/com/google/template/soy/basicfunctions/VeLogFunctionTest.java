/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.template.soy.basicfunctions;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.ImmutableList;
import com.google.template.soy.jssrc.restricted.JsExpr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public final class VeLogFunctionTest {

  @Test
  public void testComputeForJsSrc() {
    VeLogFunction function = VeLogFunction.INSTANCE;
    JsExpr argExpr = new JsExpr("1", Integer.MAX_VALUE);
    assertThat(function.computeForJsSrc(ImmutableList.of(argExpr)))
        .isEqualTo(new JsExpr("soy.$$velog(1, opt_ijData.$$loggingMetadata)", Integer.MAX_VALUE));
  }
}
