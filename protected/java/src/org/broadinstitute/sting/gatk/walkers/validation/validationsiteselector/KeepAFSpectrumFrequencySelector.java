/*
*  By downloading the PROGRAM you agree to the following terms of use:
*  
*  BROAD INSTITUTE - SOFTWARE LICENSE AGREEMENT - FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
*  
*  This Agreement is made between the Broad Institute, Inc. with a principal address at 7 Cambridge Center, Cambridge, MA 02142 (BROAD) and the LICENSEE and is effective at the date the downloading is completed (EFFECTIVE DATE).
*  
*  WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
*  WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
*  NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
*  
*  1. DEFINITIONS
*  1.1 PROGRAM shall mean copyright in the object code and source code known as GATK2 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute/GATK on the EFFECTIVE DATE.
*  
*  2. LICENSE
*  2.1   Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM. 
*  The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only.  For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
*  2.2  No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD.  LICENSEE shall ensure that all of its users agree to the terms of this Agreement.  LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
*  2.3  License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.  
*  
*  3. OWNERSHIP OF INTELLECTUAL PROPERTY 
*  LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies.  LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
*  Copyright 2012 Broad Institute, Inc.
*  Notice of attribution:  The GATK2 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
*  LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
*  
*  4. INDEMNIFICATION
*  LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
*  
*  5. NO REPRESENTATIONS OR WARRANTIES
*  THE PROGRAM IS DELIVERED AS IS.  BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
*  IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
*  
*  6. ASSIGNMENT
*  This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
*  
*  7. MISCELLANEOUS
*  7.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
*  7.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
*  7.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
*  7.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested.  All notices under this Agreement shall be deemed effective upon receipt. 
*  7.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter. 
*  7.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
*  7.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/

package org.broadinstitute.sting.gatk.walkers.validation.validationsiteselector;

import org.broadinstitute.sting.gatk.GenomeAnalysisEngine;
import org.broadinstitute.sting.utils.GenomeLocParser;
import org.broadinstitute.sting.utils.MathUtils;
import org.broadinstitute.variant.vcf.VCFConstants;
import org.broadinstitute.variant.variantcontext.VariantContext;
import org.broadinstitute.variant.variantcontext.VariantContextUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class KeepAFSpectrumFrequencySelector extends FrequencyModeSelector {

    private static final boolean DEBUG = true;

    private int NUM_BINS = 20;

    private int[] preSampleSelectionHistogram;
    private int numTotalSites = 0;
    private int[] postSampleSelectionHistogram;
    private int numSampleSelectedSites = 0;
    private ArrayList<GenomeEvent>[] binnedEventArray;

    public KeepAFSpectrumFrequencySelector(int numBins, GenomeLocParser parser) {
        super(parser);
        NUM_BINS = numBins;
        // initialize arrays dependent on NUM_BINS
        binnedEventArray = new ArrayList[NUM_BINS];

        for (int k=0; k < NUM_BINS; k++)
            binnedEventArray[k] = new ArrayList<GenomeEvent>();

        preSampleSelectionHistogram = new int[NUM_BINS];
        postSampleSelectionHistogram = new int[NUM_BINS];
    }

    public void logCurrentSiteData(VariantContext vc, boolean selectedInTargetSamples, boolean IGNORE_GENOTYPES, boolean IGNORE_POLYMORPHIC) {

        // this method is called for every  variant of a selected type, regardless of  whether it will be selectable or not
        // get AC,AF,AN attributes from vc
        HashMap<String, Object> attributes = new HashMap<String, Object>();
        double[] afArray = null;

        if (vc.hasGenotypes() && !IGNORE_GENOTYPES) {
            // recompute AF,AC,AN based on genotypes:
            // todo - - maybe too inefficient??
            VariantContextUtils.calculateChromosomeCounts(vc, attributes, false);
        }

        // sites-only vc or we explicitly tell to ignore genotypes; we trust the AF field if present
        if ( vc.hasAttribute(VCFConstants.ALLELE_FREQUENCY_KEY) )  {
            String afo = vc.getAttributeAsString(VCFConstants.ALLELE_FREQUENCY_KEY, null);

            if (afo.contains(",")) {
                String[] afs = afo.split(",");
                afs[0] = afs[0].substring(1,afs[0].length());
                afs[afs.length-1] = afs[afs.length-1].substring(0,afs[afs.length-1].length()-1);

                afArray = new double[afs.length];

                for (int k=0; k < afArray.length; k++)
                    afArray[k] = Double.valueOf(afs[k]);
            }
            else
                afArray = new double[] {Double.valueOf(afo)};
        }


        if (afArray == null )
            return;

        double af0 = MathUtils.arrayMax(afArray);

        int binIndex = (NUM_BINS-1) - (int) Math.floor(((1.0-af0)*NUM_BINS));
        // deal with round-off issue: low-AC sites with large samples can have AF rounded down to 0.000
        if (binIndex < 0)
            binIndex = 0;
//        System.out.format("Pre:%4.4f %d\n",af0, binIndex);
        preSampleSelectionHistogram[binIndex]++;
        numTotalSites++;

        // now process VC subsetted to samples of interest
        if (! selectedInTargetSamples && !IGNORE_POLYMORPHIC)
            return;

        //System.out.format("Post:%4.4f %d\n",af0, binIndex);
        postSampleSelectionHistogram[binIndex]++;
        numSampleSelectedSites++;

        // create bare-bones event and log in corresponding bin
        // attributes contains AC,AF,AN pulled from original vc, and we keep them here and log in output file for bookkeeping purposes
        GenomeEvent event = new GenomeEvent(parser, vc.getChr(), vc.getStart(), vc.getEnd(),vc.getAlleles(), attributes);

        binnedEventArray[binIndex].add(event);

    }

    public ArrayList<VariantContext> selectValidationSites(int numValidationSites) {
        // number of sites to choose at random for each frequency bin = #desired validation sites/# total sites * #sites in original bin
        int[] sitesToChoosePerBin = new int[NUM_BINS];
        int totalSites = 0;
        for (int k=0; k < NUM_BINS; k++) {
            int sites = (int)Math.round((double)numValidationSites * preSampleSelectionHistogram[k]/ (double)numTotalSites);
            sitesToChoosePerBin[k] = sites;
            totalSites += sites;
        }

        // deal with rounding artifacts
        while (totalSites > numValidationSites) {
            // take off one from randomly selected bin
            int k= GenomeAnalysisEngine.getRandomGenerator().nextInt(NUM_BINS);
            sitesToChoosePerBin[k]--;
            totalSites--;
        }
        while (totalSites < numValidationSites) {
            // take off one from randomly selected bin
            int k= GenomeAnalysisEngine.getRandomGenerator().nextInt( NUM_BINS);
            sitesToChoosePerBin[k]++;
            totalSites++;
        }

        if (DEBUG) {
            System.out.println("sitesToChoosePerBin:");
            for (int k=0; k < NUM_BINS; k++)
                System.out.format("%d ", sitesToChoosePerBin[k]);
            System.out.println();

            System.out.println("preSampleSelectionHistogram:");
            for (int k=0; k < NUM_BINS; k++)
                System.out.format("%d ", preSampleSelectionHistogram[k]);
            System.out.println();

            System.out.println("postSampleSelectionHistogram:");
            for (int k=0; k < NUM_BINS; k++)
                System.out.format("%d ", postSampleSelectionHistogram[k]);
            System.out.println();

        }

        // take randomly sitesToChoosePerBin[k] elements from each bin
        ArrayList<GenomeEvent> selectedEvents = new ArrayList<GenomeEvent>();

        for (int k=0; k < NUM_BINS; k++) {
            selectedEvents.addAll(MathUtils.randomSubset(binnedEventArray[k], sitesToChoosePerBin[k]));
        }

        Collections.sort(selectedEvents);

        // now convert to VC
        ArrayList<VariantContext> selectedSites = new ArrayList<VariantContext>();
        for (GenomeEvent event : selectedEvents)
            selectedSites.add(event.createVariantContextFromEvent());

        return selectedSites;

    }

}
