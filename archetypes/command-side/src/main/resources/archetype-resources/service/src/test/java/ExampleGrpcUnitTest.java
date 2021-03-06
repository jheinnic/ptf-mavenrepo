#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import name.jchein.portfolio.common.es.eventuate.IUUIDExtension;
import name.jchein.portfolio.common.grpc.action.BasicReply;
import name.jchein.portfolio.common.grpc.action.StatusCode;
import name.jchein.common.identity.EnableUUIDGenerator;

import ${package}.fixtures.EnableExampleGrpcUnitTest;
import ${package}.fixtures.GrpcFixtureData;

import ${package}.grpc.proto.CreateExampleRequest;
import ${package}.grpc.proto.ExampleGrpc;
import ${package}.backend.ExampleDomainService;


@EnableExampleGrpcUnitTest
@EnableUUIDGenerator
public class ExampleGrpcUnitTest
{
   @ClassRule
   public static final SpringClassRule springClassRule = new SpringClassRule();

   @Rule
   public final SpringMethodRule springMethodRule = new SpringMethodRule();

   @MockBean
   public ExampleDomainService domainService;

   @MockBean
   public IUUIDExtension identityExtension;

   @Autowired
   public ExampleGrpc.ExampleBlockingStub blockingClient;

   @Test
   public void testIt()
   {
      if (this.domainService == null) { throw new RuntimeException(); }

      BasicReply reply =
         this.blockingClient.createExample(
            CreateExampleRequest.newBuilder()
               .setId(GrpcFixtureData.VALID_EXAMPLE_ID_ONE_STRING)
               .setPilotId(GrpcFixtureData.VALID_PILOT_ID_ONE_STRING)
               .setFirstName(GrpcFixtureData.VALID_FIRST_NAME_ONE)
               .setMiddleName(GrpcFixtureData.VALID_MIDDLE_NAME_ONE)
               .setLastName(GrpcFixtureData.VALID_LAST_NAME_ONE)
               .build());

      assertThat(reply.getStatus()).as("Basic reply status")
         .isEqualTo(StatusCode.OK);
   }
}
