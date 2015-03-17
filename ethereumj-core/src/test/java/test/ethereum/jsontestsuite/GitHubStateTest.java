package test.ethereum.jsontestsuite;

import org.ethereum.jsontestsuite.JSONReader;

import org.json.simple.parser.ParseException;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GitHubStateTest {

    //SHACOMMIT of tested commit, ethereum/tests.git
    public String shacommit = "ca6dfa9c0155b46ea205ce4edc5178f5772d28e3";

    //@Ignore
    @Test // this method is mostly for hands-on convenient testing
    public void stSingleTest() throws ParseException {
        String json = JSONReader.loadJSONFromCommit("StateTests/stSystemOperationsTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json, "CallRecursiveBombLog2");
    }

    //@Ignore
    @Test // this method is mostly for hands-on convenient testing
    public void runWithExcludedTest() throws ParseException {
        Set<String> excluded = new HashSet<>();
        String json = JSONReader.loadJSONFromCommit("StateTests/stPreCompiledContracts.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json, excluded);
    }

    //@Ignore
    @Test
    public void stExample() throws ParseException {  // [V]
        String json = JSONReader.loadJSONFromCommit("StateTests/stExample.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json);
    }

    @Ignore //FIXME
    @Test
    public void stCallCreateCallCodeTest() throws ParseException { // [V]
        Set<String> excluded = new HashSet<>();
        String json = JSONReader.loadJSONFromCommit("StateTests/stCallCreateCallCodeTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json, excluded);
    }

    //@Ignore
    @Test
    public void stInitCodeTest() throws ParseException { // [V]
        Set<String> excluded = new HashSet<>();
        String json = JSONReader.loadJSONFromCommit("StateTests/stInitCodeTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json, excluded);
    }

    //@Ignore
    @Test
    public void stLogTests() throws ParseException { // [V]
        Set<String> excluded = new HashSet<>();
        String json = JSONReader.loadJSONFromCommit("StateTests/stLogTests.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json, excluded);
    }

    //@Ignore
    @Test
    public void stPreCompiledContracts() throws ParseException {
        Set<String> excluded = new HashSet<>();
        String json = JSONReader.loadJSONFromCommit("StateTests/stPreCompiledContracts.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json, excluded);
    }

    @Ignore //FIXME
    @Test
    public void stMemoryStressTest() throws ParseException { // [V]
        String json = JSONReader.loadJSONFromCommit("StateTests/stMemoryStressTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json);
    }

    //@Ignore
    @Test
    public void stMemoryTest() throws ParseException { // [V]
        String json = JSONReader.loadJSONFromCommit("StateTests/stMemoryTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json);
    }

    //@Ignore
    @Test
    public void stQuadraticComplexityTest() throws ParseException { // [V]
        String json = JSONReader.loadJSONFromCommit("StateTests/stQuadraticComplexityTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json);
    }

    //@Ignore
    @Test
    public void stSolidityTest() throws ParseException { // [V]
        Set<String> excluded = new HashSet<>();
        String json = JSONReader.loadJSONFromCommit("StateTests/stSolidityTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json, excluded);
    }

    //@Ignore
    @Test
    public void stRecursiveCreate() throws ParseException { // [V]
        String json = JSONReader.loadJSONFromCommit("StateTests/stRecursiveCreate.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json);
    }

    //@Ignore
    @Test
    public void stRefundTest() throws ParseException { // [V]
        Set<String> excluded = new HashSet<>();
        String json = JSONReader.loadJSONFromCommit("StateTests/stRefundTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json, excluded);
    }

    //@Ignore
    @Test
    public void stSpecialTest() throws ParseException { // [V]

        String json = JSONReader.loadJSONFromCommit("StateTests/stSpecialTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json);
    }

    //@Ignore
    @Test
    public void stBlockHashTest() throws ParseException {

        String json = JSONReader.loadJSONFromCommit("StateTests/stBlockHashTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json);
    }

    //@Ignore
    @Test
    public void stSystemOperationsTest() throws ParseException {
        Set<String> excluded = new HashSet<>();
        excluded.add("CallRecursiveBomb0_OOG_atMaxCallDepth"); //TODO failing on cpp?
        excluded.add("Call10"); //TODO gaslimit exceeds Block long
        String json = JSONReader.loadJSONFromCommit("StateTests/stSystemOperationsTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json, excluded);
    }

    @Ignore //FIXME
    @Test
    public void stTransactionTest() throws ParseException {
        Set<String> excluded = new HashSet<>();
        //TODO: This is going to stay excluded until we refactor
        //      the codebase to use bigintegers instead of longs
        excluded.add("HighGasLimit");
        excluded.add("SuicidesMixingCoinbase");
        String json = JSONReader.loadJSONFromCommit("StateTests/stTransactionTest.json", shacommit);
        GitHubJSONTestSuite.runGitHubJsonStateTest(json, excluded);
    }

}

