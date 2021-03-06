/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.slicer;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/slicer")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SlicerTreeTestGenerated extends AbstractSlicerTreeTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInSlicer() throws Exception {
        KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClassWithExcluded(this.getClass(), new File("idea/testData/slicer"), Pattern.compile("^(.+)\\.kt$"), null);
    }

    @TestMetadata("inflow/anonymousFunBodyExpression.kt")
    public void testInflow_AnonymousFunBodyExpression() throws Exception {
        runTest("idea/testData/slicer/inflow/anonymousFunBodyExpression.kt");
    }

    @TestMetadata("inflow/anonymousFunReturnExpression.kt")
    public void testInflow_AnonymousFunReturnExpression() throws Exception {
        runTest("idea/testData/slicer/inflow/anonymousFunReturnExpression.kt");
    }

    @TestMetadata("inflow/cast.kt")
    public void testInflow_Cast() throws Exception {
        runTest("idea/testData/slicer/inflow/cast.kt");
    }

    @TestMetadata("inflow/compositeAssignments.kt")
    public void testInflow_CompositeAssignments() throws Exception {
        runTest("idea/testData/slicer/inflow/compositeAssignments.kt");
    }

    @TestMetadata("inflow/defaultGetterFieldInSetter.kt")
    public void testInflow_DefaultGetterFieldInSetter() throws Exception {
        runTest("idea/testData/slicer/inflow/defaultGetterFieldInSetter.kt");
    }

    @TestMetadata("inflow/delegateGetter.kt")
    public void testInflow_DelegateGetter() throws Exception {
        runTest("idea/testData/slicer/inflow/delegateGetter.kt");
    }

    @TestMetadata("inflow/delegateToJavaGetter.kt")
    public void testInflow_DelegateToJavaGetter() throws Exception {
        runTest("idea/testData/slicer/inflow/delegateToJavaGetter.kt");
    }

    @TestMetadata("inflow/diamondHierarchyJKMiddleClassFun.kt")
    public void testInflow_DiamondHierarchyJKMiddleClassFun() throws Exception {
        runTest("idea/testData/slicer/inflow/diamondHierarchyJKMiddleClassFun.kt");
    }

    @TestMetadata("inflow/diamondHierarchyJKMiddleInterfaceFun.kt")
    public void testInflow_DiamondHierarchyJKMiddleInterfaceFun() throws Exception {
        runTest("idea/testData/slicer/inflow/diamondHierarchyJKMiddleInterfaceFun.kt");
    }

    @TestMetadata("inflow/diamondHierarchyJKRootInterfaceFun.kt")
    public void testInflow_DiamondHierarchyJKRootInterfaceFun() throws Exception {
        runTest("idea/testData/slicer/inflow/diamondHierarchyJKRootInterfaceFun.kt");
    }

    @TestMetadata("inflow/diamondHierarchyMiddleClassFun.kt")
    public void testInflow_DiamondHierarchyMiddleClassFun() throws Exception {
        runTest("idea/testData/slicer/inflow/diamondHierarchyMiddleClassFun.kt");
    }

    @TestMetadata("inflow/diamondHierarchyMiddleInterfaceFun.kt")
    public void testInflow_DiamondHierarchyMiddleInterfaceFun() throws Exception {
        runTest("idea/testData/slicer/inflow/diamondHierarchyMiddleInterfaceFun.kt");
    }

    @TestMetadata("inflow/diamondHierarchyRootInterfaceFun.kt")
    public void testInflow_DiamondHierarchyRootInterfaceFun() throws Exception {
        runTest("idea/testData/slicer/inflow/diamondHierarchyRootInterfaceFun.kt");
    }

    @TestMetadata("inflow/doubleLambdaResult.kt")
    public void testInflow_DoubleLambdaResult() throws Exception {
        runTest("idea/testData/slicer/inflow/doubleLambdaResult.kt");
    }

    @TestMetadata("inflow/funParamerer.kt")
    public void testInflow_FunParamerer() throws Exception {
        runTest("idea/testData/slicer/inflow/funParamerer.kt");
    }

    @TestMetadata("inflow/funParamererWithDefault.kt")
    public void testInflow_FunParamererWithDefault() throws Exception {
        runTest("idea/testData/slicer/inflow/funParamererWithDefault.kt");
    }

    @TestMetadata("inflow/funResultViaCallableRef.kt")
    public void testInflow_FunResultViaCallableRef() throws Exception {
        runTest("idea/testData/slicer/inflow/funResultViaCallableRef.kt");
    }

    @TestMetadata("inflow/funResultViaCallableRefWithAssignment.kt")
    public void testInflow_FunResultViaCallableRefWithAssignment() throws Exception {
        runTest("idea/testData/slicer/inflow/funResultViaCallableRefWithAssignment.kt");
    }

    @TestMetadata("inflow/funResultViaCallableRefWithDirectCall.kt")
    public void testInflow_FunResultViaCallableRefWithDirectCall() throws Exception {
        runTest("idea/testData/slicer/inflow/funResultViaCallableRefWithDirectCall.kt");
    }

    @TestMetadata("inflow/funWithExpressionBody.kt")
    public void testInflow_FunWithExpressionBody() throws Exception {
        runTest("idea/testData/slicer/inflow/funWithExpressionBody.kt");
    }

    @TestMetadata("inflow/funWithReturnExpressions.kt")
    public void testInflow_FunWithReturnExpressions() throws Exception {
        runTest("idea/testData/slicer/inflow/funWithReturnExpressions.kt");
    }

    @TestMetadata("inflow/getterAndSetterUsingField.kt")
    public void testInflow_GetterAndSetterUsingField() throws Exception {
        runTest("idea/testData/slicer/inflow/getterAndSetterUsingField.kt");
    }

    @TestMetadata("inflow/getterExpressionBody.kt")
    public void testInflow_GetterExpressionBody() throws Exception {
        runTest("idea/testData/slicer/inflow/getterExpressionBody.kt");
    }

    @TestMetadata("inflow/getterReturnExpression.kt")
    public void testInflow_GetterReturnExpression() throws Exception {
        runTest("idea/testData/slicer/inflow/getterReturnExpression.kt");
    }

    @TestMetadata("inflow/ifExpression.kt")
    public void testInflow_IfExpression() throws Exception {
        runTest("idea/testData/slicer/inflow/ifExpression.kt");
    }

    @TestMetadata("inflow/lambdaResult.kt")
    public void testInflow_LambdaResult() throws Exception {
        runTest("idea/testData/slicer/inflow/lambdaResult.kt");
    }

    @TestMetadata("inflow/lambdaResultWithAssignments.kt")
    public void testInflow_LambdaResultWithAssignments() throws Exception {
        runTest("idea/testData/slicer/inflow/lambdaResultWithAssignments.kt");
    }

    @TestMetadata("inflow/lambdaResultWithDirectCall.kt")
    public void testInflow_LambdaResultWithDirectCall() throws Exception {
        runTest("idea/testData/slicer/inflow/lambdaResultWithDirectCall.kt");
    }

    @TestMetadata("inflow/lambdaResultWithDirectCallViaAssignment.kt")
    public void testInflow_LambdaResultWithDirectCallViaAssignment() throws Exception {
        runTest("idea/testData/slicer/inflow/lambdaResultWithDirectCallViaAssignment.kt");
    }

    @TestMetadata("inflow/localVal.kt")
    public void testInflow_LocalVal() throws Exception {
        runTest("idea/testData/slicer/inflow/localVal.kt");
    }

    @TestMetadata("inflow/localVar.kt")
    public void testInflow_LocalVar() throws Exception {
        runTest("idea/testData/slicer/inflow/localVar.kt");
    }

    @TestMetadata("inflow/memberValWithInitializer.kt")
    public void testInflow_MemberValWithInitializer() throws Exception {
        runTest("idea/testData/slicer/inflow/memberValWithInitializer.kt");
    }

    @TestMetadata("inflow/memberValWithSplitInitializer.kt")
    public void testInflow_MemberValWithSplitInitializer() throws Exception {
        runTest("idea/testData/slicer/inflow/memberValWithSplitInitializer.kt");
    }

    @TestMetadata("inflow/memberVarWithInitializer.kt")
    public void testInflow_MemberVarWithInitializer() throws Exception {
        runTest("idea/testData/slicer/inflow/memberVarWithInitializer.kt");
    }

    @TestMetadata("inflow/memberVarWithSplitInitializer.kt")
    public void testInflow_MemberVarWithSplitInitializer() throws Exception {
        runTest("idea/testData/slicer/inflow/memberVarWithSplitInitializer.kt");
    }

    @TestMetadata("inflow/noFieldInGetter.kt")
    public void testInflow_NoFieldInGetter() throws Exception {
        runTest("idea/testData/slicer/inflow/noFieldInGetter.kt");
    }

    @TestMetadata("inflow/nonLocalReturn.kt")
    public void testInflow_NonLocalReturn() throws Exception {
        runTest("idea/testData/slicer/inflow/nonLocalReturn.kt");
    }

    @TestMetadata("inflow/notNullAssertion.kt")
    public void testInflow_NotNullAssertion() throws Exception {
        runTest("idea/testData/slicer/inflow/notNullAssertion.kt");
    }

    @TestMetadata("inflow/nullsAndNotNulls.kt")
    public void testInflow_NullsAndNotNulls() throws Exception {
        runTest("idea/testData/slicer/inflow/nullsAndNotNulls.kt");
    }

    @TestMetadata("inflow/overridingFunctionResult.kt")
    public void testInflow_OverridingFunctionResult() throws Exception {
        runTest("idea/testData/slicer/inflow/overridingFunctionResult.kt");
    }

    @TestMetadata("inflow/overridingParameter.kt")
    public void testInflow_OverridingParameter() throws Exception {
        runTest("idea/testData/slicer/inflow/overridingParameter.kt");
    }

    @TestMetadata("inflow/overridingPropertyGetterResult.kt")
    public void testInflow_OverridingPropertyGetterResult() throws Exception {
        runTest("idea/testData/slicer/inflow/overridingPropertyGetterResult.kt");
    }

    @TestMetadata("inflow/overridingPropertyResult.kt")
    public void testInflow_OverridingPropertyResult() throws Exception {
        runTest("idea/testData/slicer/inflow/overridingPropertyResult.kt");
    }

    @TestMetadata("inflow/primaryConstructorParameter.kt")
    public void testInflow_PrimaryConstructorParameter() throws Exception {
        runTest("idea/testData/slicer/inflow/primaryConstructorParameter.kt");
    }

    @TestMetadata("inflow/primaryConstructorParameterWithDefault.kt")
    public void testInflow_PrimaryConstructorParameterWithDefault() throws Exception {
        runTest("idea/testData/slicer/inflow/primaryConstructorParameterWithDefault.kt");
    }

    @TestMetadata("inflow/qualifiedAssignmentsForQualifiedRef.kt")
    public void testInflow_QualifiedAssignmentsForQualifiedRef() throws Exception {
        runTest("idea/testData/slicer/inflow/qualifiedAssignmentsForQualifiedRef.kt");
    }

    @TestMetadata("inflow/qualifiedAssignmentsForSimpleRef.kt")
    public void testInflow_QualifiedAssignmentsForSimpleRef() throws Exception {
        runTest("idea/testData/slicer/inflow/qualifiedAssignmentsForSimpleRef.kt");
    }

    @TestMetadata("inflow/safeCast.kt")
    public void testInflow_SafeCast() throws Exception {
        runTest("idea/testData/slicer/inflow/safeCast.kt");
    }

    @TestMetadata("inflow/secondaryConstructorParameter.kt")
    public void testInflow_SecondaryConstructorParameter() throws Exception {
        runTest("idea/testData/slicer/inflow/secondaryConstructorParameter.kt");
    }

    @TestMetadata("inflow/secondaryConstructorParameterWithDefault.kt")
    public void testInflow_SecondaryConstructorParameterWithDefault() throws Exception {
        runTest("idea/testData/slicer/inflow/secondaryConstructorParameterWithDefault.kt");
    }

    @TestMetadata("inflow/settersViaDelegateForQualifiedRef.kt")
    public void testInflow_SettersViaDelegateForQualifiedRef() throws Exception {
        runTest("idea/testData/slicer/inflow/settersViaDelegateForQualifiedRef.kt");
    }

    @TestMetadata("inflow/settersViaDelegateForSimpleRef.kt")
    public void testInflow_SettersViaDelegateForSimpleRef() throws Exception {
        runTest("idea/testData/slicer/inflow/settersViaDelegateForSimpleRef.kt");
    }

    @TestMetadata("inflow/settersViaJavaDelegate.kt")
    public void testInflow_SettersViaJavaDelegate() throws Exception {
        runTest("idea/testData/slicer/inflow/settersViaJavaDelegate.kt");
    }

    @TestMetadata("inflow/topLevelVal.kt")
    public void testInflow_TopLevelVal() throws Exception {
        runTest("idea/testData/slicer/inflow/topLevelVal.kt");
    }

    @TestMetadata("inflow/topLevelVar.kt")
    public void testInflow_TopLevelVar() throws Exception {
        runTest("idea/testData/slicer/inflow/topLevelVar.kt");
    }

    @TestMetadata("inflow/valParameter.kt")
    public void testInflow_ValParameter() throws Exception {
        runTest("idea/testData/slicer/inflow/valParameter.kt");
    }

    @TestMetadata("inflow/varParameter.kt")
    public void testInflow_VarParameter() throws Exception {
        runTest("idea/testData/slicer/inflow/varParameter.kt");
    }

    @TestMetadata("inflow/whenExpression.kt")
    public void testInflow_WhenExpression() throws Exception {
        runTest("idea/testData/slicer/inflow/whenExpression.kt");
    }

    @TestMetadata("outflow/anonymousFunBodyExpression.kt")
    public void testOutflow_AnonymousFunBodyExpression() throws Exception {
        runTest("idea/testData/slicer/outflow/anonymousFunBodyExpression.kt");
    }

    @TestMetadata("outflow/anonymousFunReturnExpression.kt")
    public void testOutflow_AnonymousFunReturnExpression() throws Exception {
        runTest("idea/testData/slicer/outflow/anonymousFunReturnExpression.kt");
    }

    @TestMetadata("outflow/callArgument.kt")
    public void testOutflow_CallArgument() throws Exception {
        runTest("idea/testData/slicer/outflow/callArgument.kt");
    }

    @TestMetadata("outflow/callArgumentKJK.kt")
    public void testOutflow_CallArgumentKJK() throws Exception {
        runTest("idea/testData/slicer/outflow/callArgumentKJK.kt");
    }

    @TestMetadata("outflow/cast.kt")
    public void testOutflow_Cast() throws Exception {
        runTest("idea/testData/slicer/outflow/cast.kt");
    }

    @TestMetadata("outflow/defaultExplicitPrimaryConstructorCalls.kt")
    public void testOutflow_DefaultExplicitPrimaryConstructorCalls() throws Exception {
        runTest("idea/testData/slicer/outflow/defaultExplicitPrimaryConstructorCalls.kt");
    }

    @TestMetadata("outflow/diamondHierarchyJKLeafClassFun.kt")
    public void testOutflow_DiamondHierarchyJKLeafClassFun() throws Exception {
        runTest("idea/testData/slicer/outflow/diamondHierarchyJKLeafClassFun.kt");
    }

    @TestMetadata("outflow/diamondHierarchyJKMiddleClassFun.kt")
    public void testOutflow_DiamondHierarchyJKMiddleClassFun() throws Exception {
        runTest("idea/testData/slicer/outflow/diamondHierarchyJKMiddleClassFun.kt");
    }

    @TestMetadata("outflow/diamondHierarchyJKMiddleInterfaceFun.kt")
    public void testOutflow_DiamondHierarchyJKMiddleInterfaceFun() throws Exception {
        runTest("idea/testData/slicer/outflow/diamondHierarchyJKMiddleInterfaceFun.kt");
    }

    @TestMetadata("outflow/diamondHierarchyLeafClassFun.kt")
    public void testOutflow_DiamondHierarchyLeafClassFun() throws Exception {
        runTest("idea/testData/slicer/outflow/diamondHierarchyLeafClassFun.kt");
    }

    @TestMetadata("outflow/diamondHierarchyMiddleClassFun.kt")
    public void testOutflow_DiamondHierarchyMiddleClassFun() throws Exception {
        runTest("idea/testData/slicer/outflow/diamondHierarchyMiddleClassFun.kt");
    }

    @TestMetadata("outflow/diamondHierarchyMiddleInterfaceFun.kt")
    public void testOutflow_DiamondHierarchyMiddleInterfaceFun() throws Exception {
        runTest("idea/testData/slicer/outflow/diamondHierarchyMiddleInterfaceFun.kt");
    }

    @TestMetadata("outflow/doubleLambdaResult.kt")
    public void testOutflow_DoubleLambdaResult() throws Exception {
        runTest("idea/testData/slicer/outflow/doubleLambdaResult.kt");
    }

    @TestMetadata("outflow/explicitLambdaReturnExpression.kt")
    public void testOutflow_ExplicitLambdaReturnExpression() throws Exception {
        runTest("idea/testData/slicer/outflow/explicitLambdaReturnExpression.kt");
    }

    @TestMetadata("outflow/extensionIndexingDereferences.kt")
    public void testOutflow_ExtensionIndexingDereferences() throws Exception {
        runTest("idea/testData/slicer/outflow/extensionIndexingDereferences.kt");
    }

    @TestMetadata("outflow/forVariable.kt")
    public void testOutflow_ForVariable() throws Exception {
        runTest("idea/testData/slicer/outflow/forVariable.kt");
    }

    @TestMetadata("outflow/funBodyExpression.kt")
    public void testOutflow_FunBodyExpression() throws Exception {
        runTest("idea/testData/slicer/outflow/funBodyExpression.kt");
    }

    @TestMetadata("outflow/functionCalls.kt")
    public void testOutflow_FunctionCalls() throws Exception {
        runTest("idea/testData/slicer/outflow/functionCalls.kt");
    }

    @TestMetadata("outflow/funParameterUsages.kt")
    public void testOutflow_FunParameterUsages() throws Exception {
        runTest("idea/testData/slicer/outflow/funParameterUsages.kt");
    }

    @TestMetadata("outflow/funResultViaCallableRef.kt")
    public void testOutflow_FunResultViaCallableRef() throws Exception {
        runTest("idea/testData/slicer/outflow/funResultViaCallableRef.kt");
    }

    @TestMetadata("outflow/funResultViaCallableRefWithAssignment.kt")
    public void testOutflow_FunResultViaCallableRefWithAssignment() throws Exception {
        runTest("idea/testData/slicer/outflow/funResultViaCallableRefWithAssignment.kt");
    }

    @TestMetadata("outflow/funResultViaCallableRefWithDirectCall.kt")
    public void testOutflow_FunResultViaCallableRefWithDirectCall() throws Exception {
        runTest("idea/testData/slicer/outflow/funResultViaCallableRefWithDirectCall.kt");
    }

    @TestMetadata("outflow/funReturnExpression.kt")
    public void testOutflow_FunReturnExpression() throws Exception {
        runTest("idea/testData/slicer/outflow/funReturnExpression.kt");
    }

    @TestMetadata("outflow/getFunCalls.kt")
    public void testOutflow_GetFunCalls() throws Exception {
        runTest("idea/testData/slicer/outflow/getFunCalls.kt");
    }

    @TestMetadata("outflow/getterExpressionBody.kt")
    public void testOutflow_GetterExpressionBody() throws Exception {
        runTest("idea/testData/slicer/outflow/getterExpressionBody.kt");
    }

    @TestMetadata("outflow/getterReturnExpression.kt")
    public void testOutflow_GetterReturnExpression() throws Exception {
        runTest("idea/testData/slicer/outflow/getterReturnExpression.kt");
    }

    @TestMetadata("outflow/ifExpression.kt")
    public void testOutflow_IfExpression() throws Exception {
        runTest("idea/testData/slicer/outflow/ifExpression.kt");
    }

    @TestMetadata("outflow/indexingDereferences.kt")
    public void testOutflow_IndexingDereferences() throws Exception {
        runTest("idea/testData/slicer/outflow/indexingDereferences.kt");
    }

    @TestMetadata("outflow/jvmFieldMemberPropertyJavaUsages.kt")
    public void testOutflow_JvmFieldMemberPropertyJavaUsages() throws Exception {
        runTest("idea/testData/slicer/outflow/jvmFieldMemberPropertyJavaUsages.kt");
    }

    @TestMetadata("outflow/lambdaResult.kt")
    public void testOutflow_LambdaResult() throws Exception {
        runTest("idea/testData/slicer/outflow/lambdaResult.kt");
    }

    @TestMetadata("outflow/lambdaResultWithAssignments.kt")
    public void testOutflow_LambdaResultWithAssignments() throws Exception {
        runTest("idea/testData/slicer/outflow/lambdaResultWithAssignments.kt");
    }

    @TestMetadata("outflow/lambdaResultWithDirectCall.kt")
    public void testOutflow_LambdaResultWithDirectCall() throws Exception {
        runTest("idea/testData/slicer/outflow/lambdaResultWithDirectCall.kt");
    }

    @TestMetadata("outflow/lambdaResultWithDirectCallViaAssignment.kt")
    public void testOutflow_LambdaResultWithDirectCallViaAssignment() throws Exception {
        runTest("idea/testData/slicer/outflow/lambdaResultWithDirectCallViaAssignment.kt");
    }

    @TestMetadata("outflow/localVariableUsages.kt")
    public void testOutflow_LocalVariableUsages() throws Exception {
        runTest("idea/testData/slicer/outflow/localVariableUsages.kt");
    }

    @TestMetadata("outflow/memberPropertyUsages.kt")
    public void testOutflow_MemberPropertyUsages() throws Exception {
        runTest("idea/testData/slicer/outflow/memberPropertyUsages.kt");
    }

    @TestMetadata("outflow/nonLocalReturn.kt")
    public void testOutflow_NonLocalReturn() throws Exception {
        runTest("idea/testData/slicer/outflow/nonLocalReturn.kt");
    }

    @TestMetadata("outflow/notNullAssertion.kt")
    public void testOutflow_NotNullAssertion() throws Exception {
        runTest("idea/testData/slicer/outflow/notNullAssertion.kt");
    }

    @TestMetadata("outflow/operatorCallDereferences.kt")
    public void testOutflow_OperatorCallDereferences() throws Exception {
        runTest("idea/testData/slicer/outflow/operatorCallDereferences.kt");
    }

    @TestMetadata("outflow/operatorFunCalls.kt")
    public void testOutflow_OperatorFunCalls() throws Exception {
        runTest("idea/testData/slicer/outflow/operatorFunCalls.kt");
    }

    @TestMetadata("outflow/overridingFunctionResult.kt")
    public void testOutflow_OverridingFunctionResult() throws Exception {
        runTest("idea/testData/slicer/outflow/overridingFunctionResult.kt");
    }

    @TestMetadata("outflow/overridingFunctionResultWithJava.kt")
    public void testOutflow_OverridingFunctionResultWithJava() throws Exception {
        runTest("idea/testData/slicer/outflow/overridingFunctionResultWithJava.kt");
    }

    @TestMetadata("outflow/overridingParameter.kt")
    public void testOutflow_OverridingParameter() throws Exception {
        runTest("idea/testData/slicer/outflow/overridingParameter.kt");
    }

    @TestMetadata("outflow/overridingPropertyGetterResult.kt")
    public void testOutflow_OverridingPropertyGetterResult() throws Exception {
        runTest("idea/testData/slicer/outflow/overridingPropertyGetterResult.kt");
    }

    @TestMetadata("outflow/overridingPropertyResult.kt")
    public void testOutflow_OverridingPropertyResult() throws Exception {
        runTest("idea/testData/slicer/outflow/overridingPropertyResult.kt");
    }

    @TestMetadata("outflow/primaryConstructorCalls.kt")
    public void testOutflow_PrimaryConstructorCalls() throws Exception {
        runTest("idea/testData/slicer/outflow/primaryConstructorCalls.kt");
    }

    @TestMetadata("outflow/primaryConstructorParameterUsages.kt")
    public void testOutflow_PrimaryConstructorParameterUsages() throws Exception {
        runTest("idea/testData/slicer/outflow/primaryConstructorParameterUsages.kt");
    }

    @TestMetadata("outflow/secondaryConstructorCalls.kt")
    public void testOutflow_SecondaryConstructorCalls() throws Exception {
        runTest("idea/testData/slicer/outflow/secondaryConstructorCalls.kt");
    }

    @TestMetadata("outflow/simpleCallDereferences.kt")
    public void testOutflow_SimpleCallDereferences() throws Exception {
        runTest("idea/testData/slicer/outflow/simpleCallDereferences.kt");
    }

    @TestMetadata("outflow/topLevelPropertyUsages.kt")
    public void testOutflow_TopLevelPropertyUsages() throws Exception {
        runTest("idea/testData/slicer/outflow/topLevelPropertyUsages.kt");
    }

    @TestMetadata("outflow/usagesInLoopRange.kt")
    public void testOutflow_UsagesInLoopRange() throws Exception {
        runTest("idea/testData/slicer/outflow/usagesInLoopRange.kt");
    }

    @TestMetadata("outflow/usagesInTemplates.kt")
    public void testOutflow_UsagesInTemplates() throws Exception {
        runTest("idea/testData/slicer/outflow/usagesInTemplates.kt");
    }

    @TestMetadata("outflow/valParameter.kt")
    public void testOutflow_ValParameter() throws Exception {
        runTest("idea/testData/slicer/outflow/valParameter.kt");
    }

    @TestMetadata("outflow/varParameter.kt")
    public void testOutflow_VarParameter() throws Exception {
        runTest("idea/testData/slicer/outflow/varParameter.kt");
    }

    @TestMetadata("outflow/whenExpression.kt")
    public void testOutflow_WhenExpression() throws Exception {
        runTest("idea/testData/slicer/outflow/whenExpression.kt");
    }
}
