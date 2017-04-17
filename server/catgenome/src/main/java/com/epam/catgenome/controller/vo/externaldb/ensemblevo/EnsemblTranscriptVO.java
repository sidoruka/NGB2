/*
 * MIT License
 *
 * Copyright (c) 2016 EPAM Systems
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.epam.catgenome.controller.vo.externaldb.ensemblevo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Source:
 * Created:     5/25/2016
 * Project:     CATGenome Browser
 * Make:        IntelliJ IDEA 14.1.1, JDK 1.8
 *
 * <p>
 * class for extarnale DB data (transcript)
 * </p>
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnsemblTranscriptVO extends EnsemblFullBaseVO {

    @JsonProperty(value = "Parent")
    private String parent;

    @JsonProperty(value = "is_canonical")
    private String isCanonical;

    @JsonProperty(value = "Exon")
    private EnsemblExonVO[] exon;

    @JsonProperty(value = "UTR")
    private EnsemblTranscriptVO[] utr;

    @JsonProperty(value = "Translation")
    private EnsemblTranslationVO translation;


    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getIsCanonical() {
        return isCanonical;
    }

    public void setIsCanonical(String isCanonical) {
        this.isCanonical = isCanonical;
    }

    public EnsemblTranslationVO getTranslation() {
        return translation;
    }

    public void setTranslation(EnsemblTranslationVO translation) {
        this.translation = translation;
    }

    public EnsemblExonVO[] getExon() {
        return exon;
    }

    public void setExon(EnsemblExonVO[] exon) {
        this.exon = exon;
    }

    public EnsemblTranscriptVO[] getUtr() {
        return utr;
    }

    public void setUtr(EnsemblTranscriptVO[] utr) {
        this.utr = utr;
    }
}
